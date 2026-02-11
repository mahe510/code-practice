#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
typedef struct linked
{
	struct linked *prev;
	int co;
	int exp;
	struct linked *next;
}node;

node *head1=NULL,*ptr,*head2=NULL,*head3=NULL;
node *create(node*);
void disp(node *);
node *multi(node *head1,node *head2,node *head3);
void main()
{
	int ch;
	clrscr();
	while(1)
	{
		printf("\n press 1 for creation of 1st poly \n press 2 for creation of 2nd poly \n press 3 for display of 1st poly \n press 4 for display of 2nd poly \n press 5 for Multiplication \n press 6 for display multiplicative poly \n press 7 for exit");
		scanf("%d",&ch);
		if(ch==1)
			head1=create(head1);
		else if(ch==2)
			head2=create(head2);
		else if(ch==3)
			disp(head1);
		else if(ch==4)
			disp(head2);
		else if(ch==5)
			head3=multi(head1,head2,head3);
		else if(ch==6)
			disp(head3);
		else if(ch==7)
			break;
	}
}
node *create(node *p)
{
	int c,e;
	if(p==NULL)
	{
		p=(node *)malloc(sizeof(node));
		printf("\nenter the coefficient and exponent");
		scanf("%d%d",&c,&e);
		p->co=c;
		p->exp=e;
		p->next=NULL;
		p->prev=NULL;
		ptr=p;
	}
	else
	{
		ptr->next=(node *)malloc(sizeof(node));
		ptr->next->prev=ptr;
		ptr=ptr->next;
		printf("\nenter the coefficient and exponent");
		scanf("%d%d",&c,&e);
		ptr->co=c;
		ptr->exp=e;
		ptr->next=NULL;
	}
	return p;
}
void disp(node *p1)
{
	printf("\nPolynomial is:\n");
	while(p1!=NULL)
	{
		if(p1->co>0)
			printf("+%dx^%d",p1->co,p1->exp);
		else
			printf("%dx^%d",p1->co,p1->exp);
		p1=p1->next;
	}
}
node *copy(node *p3,int co,int exp)
{
	node *temp
	

node *multi(node *p1,node *p2,node *p3)
{
	node *pt1,*pt2;
	for(pt1=p1;pt1!=NULL;pt1=pt1->next)
	{
		for(pt2=p2;pt2!=NULL;pt2=pt2->next)
		{
			if(p3==NULL)
			{
				p3=(node *)malloc(sizeof(node));

				p3->co=pt1->co*pt2->co;
				p3->exp=pt1->exp+pt2->exp;

				p3->next=NULL;
				p3->prev=NULL;
				ptr=p3;
			}
			else
			{
				ptr->next=(node *)malloc(sizeof(node));
				ptr->next->prev=ptr;
				ptr=ptr->next;
				ptr->co=pt1->co*pt2->co;
				ptr->exp=pt1->exp+pt2->exp;
				ptr->next=NULL;
			}
		}
	}
return p3;
}
