---
comments: True
layout: post
title: Akshat's Calculator
description: A nice calculator
type: hacks
courses: {'csse': {'week': 1}, 'csp': {'week': 1}, 'csa': {'week': 0}}
categories: ['C4.1']
---
<html>
<div id="calculator">
    <div id="input-wrap">
        <div id="tmp"></div>
        <div id="input"></div>
    </div>
    <div id="button-wrap">
        <button id="all-clear">AC</button>
        <button id="clear">C</button>
        <button id="sign">+/-</button>
        <button class="amt divide">/</button>
        <button class="number">7</button>
        <button class="number">8</button>
        <button class="number">9</button>
        <button class="amt times">*</button>
        <button class="number">4</button>
        <button class="number">5</button>
        <button class="number">6</button>
        <button class="amt minus">-</button>
        <button class="number">1</button>
        <button class="number">2</button>
        <button class="number">3</button>
        <button class="amt plus">+</button>
        <button class="number num-0">0</button>
        <button id="dot">.</button>
        <button id="result">=</button>
    </div>
</div>
</html>
<style>
  @font-face {
    font-family: "DungGeunMo";
    src: url("https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_six@1.2/DungGeunMo.woff")
        format("woff");
    font-weight: normal;
    font-style: normal;
}
*,
*::before {
    box-sizing: border-box;
    -webkit-tap-highlight-color: transparent;
}
html,
body {
    width: 100%;
    height: 100%;
    margin: 0;
}
body {
    font-family: "DungGeunMo";
    display: flex;
    justify-content: center;
    align-items: center;
    background: #121212;
}
/* calculator */
#calculator {
    width: 90%;
    max-width: 430px;
    padding: 25px;
    border-radius: 25px;
    background: linear-gradient(to bottom right, #404040, #0c0c0c);
}
/* input */
#input-wrap {
    position: relative;
    width: calc(100% - 4px);
    margin-bottom: 5px;
    padding: 0 5px;
    background: #a1bd66;
    text-align: right;
    box-shadow: inset 0px 0px 15px 0px rgba(0, 0, 0, 0.5);
}
#input {
    height: 5rem;
    line-height: 5rem;
    font-size: 2rem;
}
#tmp {
    position: absolute;
    right: 5px;
    top: 0.25rem;
    color: grey;
}
/* button */
#button-wrap {
    display: flex;
    width: 100%;
    flex-wrap: wrap;
    justify-content: space-around;
}
#button-wrap > button {
    width: calc(25% - 4px);
    text-align: center;
    line-height: 5rem;
    margin: 2px 0;
    background: grey;
    color: #f1f1f1;
    border-radius: 4px;
    cursor: pointer;
    user-select: none;
    outline: 0;
    transition: 0.3s;
}
#button-wrap > button.num-0 {
    width: calc(50% - 4px);
}
#button-wrap > button.number {
    background: #5d5d5f;
}
#button-wrap > button:hover {
    box-shadow: inset 0px 0px 15px 0px rgba(0, 0, 0, 0.3);
}
#button-wrap > button#result {
    background: #f55530;
}
  </style>

  <script>
    const input = document.getElementById("input");
const tmp = document.getElementById("tmp");

const empty = (element) => {
    element.innerText = "";
};

document.getElementById("all-clear").addEventListener("click", () => {
    empty(input);
    empty(tmp);
});

document.getElementById("clear").addEventListener("click", () => {
    empty(input);
});

document.querySelectorAll(".number").forEach((element) => {
    element.addEventListener("click", () => {
        if (input.innerText.length > 19)
            return alert("최대 입력 범위를 초과했습니다!");

        input.innerText += element.innerText;
    });
});

document.getElementById("dot").addEventListener("click", () => {
    if (input.innerText.includes(".")) return;

    input.innerText += ".";
});

document.getElementById("sign").addEventListener("click", () => {
    if (input.innerText.startsWith("-")) {
        input.innerText = input.innerText.slice(1);
    } else {
        input.innerText = `-${input.innerText}`;
    }
});

document.querySelectorAll(".amt").forEach((element) => {
    element.addEventListener("click", () => {
        if (input.innerText) {
            if (tmp.innerText) {
                tmp.innerText = `${tmp.innerText} ${input.innerText} ${element.innerText}`;
            } else {
                tmp.innerText = `${input.innerText} ${element.innerText}`;
            }
        } else if (tmp.innerText.slice(-1).match(/-|\+|\*|\//)) {
            let string = tmp.innerText.slice(0, -1);
            string += element.innerText;

            tmp.innerText = string;
        }

        empty(input);
    });
});

document.getElementById("result").addEventListener("click", () => {
    if (input.innerText) {
        input.innerText = eval(tmp.innerText + input.innerText);
        empty(tmp);
    }
});
    </script>