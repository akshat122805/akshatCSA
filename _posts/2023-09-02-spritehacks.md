---
toc: True
comments: True
layout: post
title: JS Sprite Hacks
description: Moving skeleton in different directions
courses: {'csp': {'week': 0}}
type: hacks
---
## Interactive Skeleton Sprite Animation

<div id="container">
    <div id="sprite"></div>
</div>

<style>
    #container {
        width: 320px;
        height: 327px;
        border: 2px solid black;
        position: relative;
        overflow: hidden;
    }

    #sprite {
        width: 320px;
        height: 327px;
        background: url('skellyops.jpg') 0 0;
        position: absolute;
        top: 0px;
        left: 0px;
    }
</style>

<script>
    let frameIndex = 0;
    let rowIndex = 0;
    const spriteDiv = document.getElementById('sprite');
    const frameWidth = 320;
    const frameHeight = 327;

    function updateSprite() {
        spriteDiv.style.backgroundPosition = `-${frameIndex * frameWidth}px -${rowIndex * frameHeight}px`;
    }

    document.addEventListener('keydown', function(event) {
        if (event.key === "ArrowRight") {
            frameIndex = (frameIndex + 1) % 4;
            rowIndex = (rowIndex + Math.floor((frameIndex) / 4)) % 3;
        }
        if (event.key === "ArrowLeft") {
            frameIndex = (frameIndex - 1 + 4) % 4;
            rowIndex = (rowIndex + Math.floor((frameIndex - 1 + 4) / 4)) % 3;
        }
        updateSprite();
    });
</script>
