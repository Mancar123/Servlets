<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Stampede Case Input</title>
    <style>
        body {
          margin: 0;
          font-family: Arial, sans-serif;
          background-image: url('https://images.news9live.com/wp-content/uploads/2024/07/Mumbai-T20.jpg?w=802&enlarge=true');
          background-size: cover;
          background-position: center;
          background-repeat: no-repeat;
          color: white;
        }

        .navbar {
          background-color: rgba(0, 0, 0, 0.7);
          padding: 10px;
          display: flex;
          gap: 20px;
        }

        .navbar a {
          color: white;
          text-decoration: none;
          font-weight: bold;
        }

        .form-container {
          background-color: rgba(0, 0, 0, 0.6);
          padding: 40px;
          max-width: 500px;
          margin: 50px auto;
          border-radius: 10px;
          text-align: center;
        }

        input[type="text"], input[type="number"] {
          width: 80%;
          padding: 10px;
          margin: 10px 0;
          border: none;
          border-radius: 5px;
        }

        input[type="submit"] {
          background-color: #ff4c4c;
          color: white;
          padding: 10px 20px;
          border: none;
          border-radius: 5px;
          cursor: pointer;
          font-weight: bold;
        }

        input[type="submit"]:hover {
          background-color: #e60000;
        }
    </style>
</head>
<body>

<div class="navbar">
    <a href="index.jsp">Home</a>
    <a href="#">Form</a>
    <a href="#news">News</a>
    <a href="#contact">Contact</a>
</div>

<div class="form-container">
    <h1>Report Stampede Incident</h1>
    <form method="post"action="Stampede">
        <input type="text" name="eventName" placeholder="Event Name" required><br>
        <input type="number" name="noOfDeaths" placeholder="Number of Deaths" required><br>
        <input type="number" name="noOfInjuries" placeholder="Number of Injuries" required><br>
        <input type="submit" value="Submit">
    </form>
</div>

</body>
</html>
