---
layout: post
title: Q18 Mini-Lesson Office Hours
description: PEMDAS Principles 
toc: True
---

# Question 18 - MATHS
<br>
<img src="{{ site.baseurl }}/images/minilesson123.png" alt="c1">
<br>

### Explanation 

Today, we're dissecting this piece of code: System.out.println(404 / 10 * 10 + 1);.

First, we need to know that Java follows standard arithmetic rules, which you might know as PEMDAS. But, here's the twist: in programming, we often don't have parentheses or exponents, and we need to remember that multiplication and division are treated equally. They are performed from left to right, just like addition and subtraction.

So, let's break it down:

- We start with division: 404 / 10. Since both numbers are integers, Java performs integer division, so we get 40, not 40.4.

- Next, we multiply by 10. The order of operations tells us to do this before adding. 40 * 10 gives us 400.

- Lastly, we add 1, arriving at 401.


So 401 is the correct answer!

Remember, Java strictly follows the left-to-right rule for operations with the same precedence. So, when you see a Java expression, take it step by step, and you'll get it right every time!
