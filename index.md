---
layout: default
title: Student Blog
---

## Akshat's CSA Blog

Go to my [Github account](https://github.com/lunaiwa) !!

## Overview of Hacks, Study and Tangibles
Blogging in GitHub pages is a way to learn and code at the same time. 

- Plans, Lists, [Scrum Boards](https://clickup.com/blog/scrum-board/) help you to track key events, show progress and record time.  Effort is a big part of your class grade.  Show plans and time spent!
- [Hacks(Todo)](https://levelup.gitconnected.com/six-ultimate-daily-hacks-for-every-programmer-60f5f10feae) enable you to stay in focus with key requirements of the class.  Each Hack will produce Tangibles.
- Tangibles or [Tangible Artifacts](https://en.wikipedia.org/wiki/Artifact_(software_development)) are things you accumulate as a learner and coder. 

# Time Box

<html>
<head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #000000;
}
</style>
</head>
<body>
<html>
<head>
    <style>
        /* Table Styles */
        table {
            width: 100%;
            border-collapse: collapse;
            border: 1px solid #ddd;
            font-family: Arial, sans-serif;
            margin: 20px 0;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        th, td {
            padding: 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
            color: #333;  /* Text color */
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        tbody tr:nth-child(even) {
            background-color: white;  /* Black background */
            color: #fff;  /* White text */
        }
        tbody tr:nth-child(odd) {
            background-color: #f2f2f2;
            color: #333;  /* Dark text */
        }
        tbody tr:hover {
            background-color: #f5f5f5;
        }
        a {
            color: #007BFF;
            text-decoration: none;
        }
        a:hover {
            text-decoration: underline;
        }
        /* Header Styles */
        h2 {
            font-family: Arial, sans-serif;
            color: #fff;  /* White text */
            font-size: 24px;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>

<h2>Akshat's Time Box</h2>

<table>
    <thead>
        <tr>
            <th>Week</th>
            <th>Plans</th>
            <th>Hacks</th>
            <th>Tangibles</th>
            <th>Review Ticket/Issues</th>
            <th>Debugging Manuals</th>
        </tr>
    </thead>
    <tbody>
        {% for row in site.data.timebox %}
        <tr>
            <td>{{ row.week }}</td>
            <td>
                {% for plan in row.plans %}
                {{ plan }}<br>
                {% endfor %}
            </td>
            <td>
                {% for hack in row.hacks %}
                {{ hack }}<br>
                {% endfor %}
            </td>
            <td>
                {% for tangible in row.tangibles %}
                <a href="{{ tangible.url }}">{{ tangible.text }}</a><br>
                {% endfor %}
            </td>
            <td>
                {% if row.review[0].url %}
                {% for review_item in row.review %}
                <a href="{{ review_item.url }}">{{ review_item.text }}</a><br>
                {% endfor %}
                {% else %}
                {{ row.review }}
                {% endif %}
            </td>
            <td>
                {% for debuggingmanuals in row.debuggingmanuals %}
                <a href="{{ debuggingmanuals.url }}">{{ debuggingmanuals.text }}</a><br>
                {% endfor %}
            </td>
        </tr>
        {% endfor %}
    </tbody>
</table>
</body>
</html>
</html>
</body>
</html>

  <summary>Click to see my freeform picture and an explanation!</summary>

  <img src="{{ site.baseurl }}/images/abme.png" alt="My freeform picture">

  <br>
  <br>

  I am back again to learn Java, right now I am relearning fastpages and some python scripting. Over the summer I went to the gym, worked on college apps, and am currently building an app with Vishnu using Flutter. Looking forward to the NFL season. I plan to get off the crap list

  <br>
<html>
<head>
<style>
* {box-sizing: border-box;}
ul {list-style-type: none;}
body {font-family: Verdana, sans-serif;}
.month {
  padding: 70px 25px;
  width: 100%;
  background: #1abc9c;
  text-align: center;
}
.month ul {
  margin: 0;
  padding: 0;
}
.month ul li {
  color: white;
  font-size: 20px;
  text-transform: uppercase;
  letter-spacing: 3px;
}
.month .prev {
  float: left;
  padding-top: 10px;
}
.month .next {
  float: right;
  padding-top: 10px;
}
.weekdays {
  margin: 0;
  padding: 10px 0;
  background-color: #ddd;
}
.weekdays li {
  display: inline-block;
  width: 13.6%;
  color: #666;
  text-align: center;
}
.days {
  padding: 10px 0;
  background: #eee;
  margin: 0;
}
.days li {
  list-style-type: none;
  display: inline-block;
  width: 13.6%;
  text-align: center;
  margin-bottom: 5px;
  font-size:12px;
  color: #777;
}
.days li .active {
  padding: 5px;
  background: #1abc9c;
  color: white !important
}
/* Add media queries for smaller screens */
@media screen and (max-width:720px) {
  .weekdays li, .days li {width: 13.1%;}
}
@media screen and (max-width: 420px) {
  .weekdays li, .days li {width: 12.5%;}
  .days li .active {padding: 2px;}
}
@media screen and (max-width: 290px) {
  .weekdays li, .days li {width: 12.2%;}
}
</style>
</head>
<body>

<h1>CSS Calendar</h1>

<div class="month">      
  <ul>
    <li class="prev">&#10094;</li>
    <li class="next">&#10095;</li>
    <li>
      August<br>
      <span style="font-size:18px">2023</span>
    </li>
  </ul>
</div>

<ul class="weekdays">
  <li>Mo</li>
  <li>Tu</li>
  <li>We</li>
  <li>Th</li>
  <li>Fr</li>
  <li>Sa</li>
  <li>Su</li>
</ul>

<ul class="days">  
  <li>1</li>
  <li>2</li>
  <li>3</li>
  <li>4</li>
  <li>5</li>
  <li>6</li>
  <li>7</li>
  <li>8</li>
  <li>9</li>
  <li>10</li>
  <li>11</li>
  <li>12</li>
  <li>13</li>
  <li>14</li>
  <li>15</li>
  <li>16</li>
  <li>17</li>
  <li>18</li>
  <li>19</li>
  <li>20</li>
  <li>21</li>
  <li>22</li>
  <li><span class="active">23</span></li>
  <li>24</li>
  <li>25</li>
  <li>26</li>
  <li>27</li>
  <li>28</li>
  <li>29</li>
  <li>30</li>
  <li>31</li>
</ul>

</body>
</html>
<br>
<br>
<br>

 <p align="center"><iframe src="https://chat.openai.com/" width="80%" height="500"></iframe></p>
