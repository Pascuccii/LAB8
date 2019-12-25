<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>LAB_8 Skachko</title>
  <style>
    body {

    }
    input, select {
      margin: 10px;
      left:100px;
      top:100px;
    }
    button{
      margin-left: 20px;
      border-radius: 4px;
      padding: 10px;
      border-color: #004577;
      background: #0075c7;
      -webkit-text-fill-color: aliceblue;
      color: white;
      left:100px;
      top:100px;
    }

  </style>
</head>
<body>

<form method=get action="doGet">
  <label for="car">  Выберите марку</label>
  <select name="car" id="car">
    <option value="toyota">toyota</option>
    <option value="honda">honda</option>
    <option value="audi">audi</option>
    <option value="tesla">tesla</option>
  </select>
  <br>
  <button type="submit">Показать картинку</button>
</form>

</body>
</html>
