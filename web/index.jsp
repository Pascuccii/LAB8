<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>LAB_8 Skachko</title>
  <style>
    input, select {
      margin: 10px;
      left:100px;
      top:100px;
    }
    button{
      margin-left: 20px;
      border-radius: 2px;
      padding: 10px;
      background: #0075c7;
      color: white;
      left:100px;
      top:100px;
    }

  </style>
</head>
<body bgcolor="#282828">

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
