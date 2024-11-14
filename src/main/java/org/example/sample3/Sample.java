package org.example.sample3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {
        //1,2,3,4,1,2,3
        List<Integer> inputList = List.of(1,2,3,4,1,2,3);
        List<Integer> dupList =  inputList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue()>1).map(entry -> entry.getKey()).collect(Collectors.toList());
        System.out.println(dupList);

        //1,2,3,4,1,2,3 - input
        //2,3,4,2,3,1,1 - output


        List<Integer>  outputList1 = inputList.stream().filter(val->val>1).collect(Collectors.toList());
        List<Integer>  outputList2 = inputList.stream().filter(val->val<=1).collect(Collectors.toList());
        List<List<Integer>> mergeList = List.of(outputList1,outputList2);
        List<Integer> finalList = mergeList.stream().flatMap(val->val.stream()).collect(Collectors.toList());
        System.out.println(finalList);


        //Optimized
        List<Integer> finalList1 = Stream.concat(
                                            inputList.stream().filter(val->val>1),
                                            inputList.stream().filter(val->val<=1))
                                    .collect(Collectors.toList());
        System.out.println(finalList1);

        List<Integer> numbers = IntStream.range(1,11).boxed().collect(Collectors.toList());
        numbers.stream().forEach(System.out::println);

        /*for(int i=0;i<outputList2.size();i++){
            outputList1.add(outputList2.get(i));
        }*/
        //System.out.println(outputList1);
        //Employee
        //id, name, salary. departmentId

        //Department
        //id departmentName


        //select salary from employee order by salary desc limit 1 offset 2;


        //select salary from employee e1
        // join department d1 on e1.id = d1.id
        // order by salary desc limit 1 offset 2;


        /*

        @RestController
        @RequestMapping("/user")
        class UserController{

            @Autowired
            private UserService userService;

            @PostMapping("/")
            public String createUser(@RequestBody User user){
                userService.createUser(user);
                return "User Created!";
            }




        }


        //desktopUser
        //mobileUser

        @service-
            @Bean
        @component-

        class UserException extends Exception{

            public UserException(String exception){
                super.Exception(exception);
            }

        }

        throw new UserException("Invalid User!");


@Test
	    public void testException(){
	        try{
	            throw new NullPointerException("Nullpointer exception occurred!");
	        }catch(NullPointerException | RuntimeException e){
	            System.out.println(e.getMessage());
	        }
	     }


	     userName:String
	     contactNumber:Number
	     password:Password
	     reTypePassword: Password
        <form>
	     <input type="text" [(ngModel)] = "userName">
	     <input type="text" [(ngModel)] = "contactNumber">
	     <input type="text" [(ngModel)] = "password">
	     <input type="text" [(ngModel)] = "reTypePassword">
	     <button (click)="changePassword()">
	    </form>
	     {{warningMessage}}

	     //password doesn't match
	     //Minimum of 8 char
	     //Should contain 1 number, one special char

        export class ChangePassword{
            userName:String
	        contactNumber:Number
	        password:Password
	        reTypePassword: Password
	        warningMessage: String
	        private UserPasswordChange userPasswordChange;
	        ChangePassword(private UserService userService){}

	        changePassword(){
	            if(password != reTypePassword){
	                warningMessage = "password doesn't match"
	            }
	            if(password.length<8){
	                warningMessage = "Minimum of 8 char"
	            }
	            if(!Pattern.match("^[A-Z, 0-9, !@#$%^&*]$")){
	                warningMessage = "Should contain 1 number, one special char"
	            }


	            //set the data to obj

	            userService.changePassword(userPasswordChange);
	        }

	        Observable(Subscriber =>{
	            Subscriber.next("");
	        })
        }
         */






    }
}
