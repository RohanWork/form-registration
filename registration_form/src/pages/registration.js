import axios from "axios";
import { useState } from "react";
import "../components/registration.css";

function Register(){
    const [id, setId] = useState("");
    const [firstname, setFname] = useState("");
    const [lastname, setLname] = useState("");
    const [city, setCity] = useState("");
    const [phone, setPhone] = useState("");
    const [salary, setSalary] = useState("");

    async function handleSubmit(event) {
        event.preventDefault();

    try{
        await axios.post("http://localhost:8080/save",
        {
            id: id,
            fname: firstname,
            lname: lastname,
            city: city,
            phone: phone,
            salary: salary
        });

        alert("User registered successfully");
        if(id == null) {
            alert("Enter ID");
        }
        if(firstname == null) {
            alert("Enter first name");
        }
        if(lastname == null) {
            alert("Enter last name");
        }
        if(city == null) {
            alert("Enter city");
        }
        if(phone == null) {
            alert("Enter contact details");
        }
        if(salary == null) {
            alert("Enter salary amount per month");
        }
        // setId("");
        // setFname("");
        // setLname("");
        // setCity("");
        // setPhone("");
        // setSalary("");
    }
    catch(err){
        alert("User registration failed");
    }
    }




    return(
    
        <div className="register-container">
        
            <form className="register-form" onSubmit={handleSubmit}>
                <br></br>
                <h1>Register</h1>
                <p>Fill in the information below</p>

                <input 
                    type="text" 
                    name="id" 
                    placeholder="Enter ID"
                    onChange={(event)=>
                        {
                            setId(event.target.value);        
                        }
                    }
                />

                <input
                    type="text"
                    name="firstname"
                    placeholder="Enter first name"
                    onChange={(event)=>
                        {
                            setFname(event.target.value);
                        }
                    }
                />

                <input
                    type="text"
                    name="lastname"
                    placeholder="Enter last name"
                    onChange={(event)=>
                        {
                            setLname(event.target.value);
                        }
                    }
                />

                <input
                    type="text"
                    name="city"
                    placeholder="Enter city"
                    onChange={(event)=>
                        {
                            setCity(event.target.value);
                        }
                    }
                />

                <input
                    type="text"
                    name="phone"
                    placeholder="Enter contact number"
                    onChange={(event)=>
                        {
                            setPhone(event.target.value);
                        }
                    }
                />

                <input
                    type="text"
                    name="salary"
                    placeholder="Enter salary"
                    onChange={(event)=>
                        {
                            setSalary(event.target.value);
                        }
                    }
                />

                <button type="submit">Register</button>

            </form>        
        
        </div>

    )
}

export default Register;

