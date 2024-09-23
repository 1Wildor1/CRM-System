let getUser = () =>{
    fetch('http://localhost:8080/GetEmployees')
        .then(response => response.json())
        .then(data => {
            debugger
            alert("hi")
            console.log(data)
        })
}

let createEmployee = () =>{
    let obj = {
        name: "Chel",
        surname: "Chelovich",
        age: 4,
        number: 960940999,
        role: "ADMIN",
        password: "1234",
        salary: 25500
    }
    fetch('http://localhost:8080/admin/CreateEmployee', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded'
        },
        body: new URLSearchParams(obj)
    })
        .then(response => response.json())
        .then(data => {
            debugger
            alert("create employee")
            console.log(data)
        })
}