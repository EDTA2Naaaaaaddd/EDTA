
const canvas = document.querySelector('#myCanvas');
const ctx = canvas.getContext('2d');
const element1 = document.querySelector('#element1');
const element2 = document.querySelector('#element2');

function connectElements(el1, el2, color = '#000') {
  const el1Rect = el1.getBoundingClientRect();
  const el2Rect = el2.getBoundingClientRect();
  const canvasRect = canvas.getBoundingClientRect();
  
  const startX = el1Rect.left - canvasRect.left + (el1Rect.width / 2);
  const startY = el1Rect.top - canvasRect.top + (el1Rect.height / 2);
  const endX = el2Rect.left - canvasRect.left + (el2Rect.width / 2);
  const endY = el2Rect.top - canvasRect.top + (el2Rect.height / 2);
  
  ctx.beginPath();
  ctx.moveTo(startX, startY);
  ctx.lineTo(endX, endY);
  ctx.strokeStyle = color;
  ctx.stroke();
}

connectElements(element1, element2)