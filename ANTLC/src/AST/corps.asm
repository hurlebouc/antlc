extern printf,exit
section .data
out:	db "%d",0xa,0x0	

VAR_LIST

section .text
global main

atoi:
	push ebx
	push ecx
	mov ebx,eax
	mov eax,0
	mov ecx,0
atoiloop:
	cmp byte[ebx],0
	je atoidone
	imul eax,10
	mov cl,byte[ebx]
	sub cl,'0'
	add eax,ecx
	inc ebx
	jmp atoiloop
atoidone:
	pop ecx
	pop ebx
	ret

main:
	push ebp
	mov ebp,esp

	cmp dword[ebp+8],INPUT_NUMBER
	jne error_end
	mov ebx,[ebp+12]

INPUT_LIST

CORPS

;OUTPUT

endprog:
	push eax
	push dword out
	call printf
	add esp,8
	mov esp,ebp
	pop ebp
	mov eax,0
	ret

error_end:
	pop ebp
	mov eax,1
	ret
	