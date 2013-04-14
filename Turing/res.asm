extern printf,exit
section .data
out:	db "%d",0xa,0x0	

zz0: 	 dd 0
tt0: 	 dd 0
xx0: 	 dd 0


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

	cmp dword[ebp+8],2
	jne error_end
	mov ebx,[ebp+12]

	mov	eax, [ebx+4]
	call	atoi
	mov	[xx0], eax



	mov	eax, 0
	mov	[Variable[zz0]], eax
beginwhile1:
	mov	eax, [xx0]
	cmp	eax, 0
	je	endwhile1
	mov	eax, [xx0]
	and	eax, 1
	mov	[Variable[tt0]], eax
	mov	eax, [tt0]
	mov	ebx, eax
	mov	eax, 0
	shl	 eax, 1
	cmp	eax, ebx
	jne	endif2
	mov	eax, [zz0]
	shl	 eax, 1
	mov	[Variable[zz0]], eax
endif2:
	mov	eax, [tt0]
	mov	ebx, eax
	mov	eax, 0
	shl	 eax, 1
	inc	eax
	cmp	eax, ebx
	jne	endif3
	mov	eax, [zz0]
	shl	 eax, 1
	inc	eax
	mov	[Variable[zz0]], eax
endif3:
	mov	eax, [xx0]
	shr	eax, 1
	mov	[Variable[xx0]], eax
	jmp	beginwhile1
endwhile1:
	mov	eax, 9
	mov	[Variable[tt0]], eax
	mov	eax, [zz0]
	jmp	endprog


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
	