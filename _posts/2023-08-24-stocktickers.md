---
comments: True
layout: post
title: Stock Market Tracker
description: Tracking my current portfolio through my CSA blog
type: hacks
courses: {'csse': {'week': 1}, 'csp': {'week': 1}, 'csa': {'week': 0}}
categories: ['C4.1']
---

<html>
  <link
    rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
    crossorigin="anonymous"
  />
  <style>
    .positive:before {
      content: "+";
      color: green;
    }
    .positive {
      color: green;
    }
    .negative {
      color: red;
    }
    th,
    td {
      padding: 1em;
    }
    body {
      margin: 2em auto;
      max-width: 80em;
    }
  </style>
  <body>
    <form action="/buy" method="post">
      <input type="text" placeholder="ticker" name="ticker" />
      <input type="text" placeholder="# shares" name="shares" />
      <input type="text" placeholder="price" name="price" />
      <input type="submit" value="Buy" />
    </form>
    <table id="portfolio">
      <tr>
        <th>Ticker</th>
        <th>Number of shares</th>
        <th>Total cost</th>
        <th>Current value</th>
        <th>Percent change</th>
      </tr>
      <tr>
        <td>Loading...</td>
      </tr>
      <tr></tr>
    </table>
    <a href="/flush">Flush DB</a>
  </body>
</html>