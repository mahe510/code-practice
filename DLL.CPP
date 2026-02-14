#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
typedef struct linked
{
	struct linked *prev;
	int no;
	struct linked *next;
}node;
node *head=NULL,*ptr;
node *create(node *);
node *insert(node *);
node *del(node *);
void disp(node *);
void main()
{
	int ch;
	while(1)
	{
		printf("\n press 1 for create \n press 2 for display \n press 3. for Insert \n press 4. for delete \n press 5 for exit \n");
		scanf("%d",&ch);
		if(ch==1)
			head=create(head);
		else if(ch==2)
			disp(head);
		else if(ch==3)
			head=insert(head);
		else if(ch==4)
			head=del(head);
		else
			break;
	}
}
node *create(node *p)
{
	int x;
	if(p==NULL)
	{
		p=(node *)malloc(sizeof(node));
		printf("\nenter a node value");
		scanf("%d",&x);
		p->no=x;
		p->next=NULL;
		p->prev=NULL;
		ptr=p;
	}
	else
	{
		ptr->next=(node *)malloc(sizeof(node));
		ptr->next->prev=ptr;
		ptr=ptr->next;
		printf("\nenter a node value");
		scanf("%d",&x);
		ptr->no=x;
		ptr->next=NULL;
	}
	return p;
}
void disp(node *p1)
{
	printf("\n Foroward Display");
	while(p1!=NULL)
	{
		printf("\n %d",p1->no);
		p1=p1->next;
	}
	printf("\n Backword Display");
	p1=ptr;
	while(p1!=NULL)
	{
		printf("\n %d",p1->no);
		p1=p1->prev;
	}
}
node *insert(node *p)
{
	int ch,x;
	node *pt,*new1;

	printf("\n Enter the value of new node");
	scanf("%d",&x);
	new1=(node*)malloc(sizeof(node));
	new1->no=x;
	new1->next=NULL;
	new1->prev=NULL;

	printf("\n 1. insert as head\n 2. insert as after");
	scanf("%d",&ch);
	if(ch==1)
	{
		new1->next=p;
		p=new1;
		p->next->prev=new1;
	}
	if(ch==2)
	{
		printf("\n Enter the node value after which uou want to insert");
		scanf("%d",&x);
		for(pt=p;pt->no!=x;pt=pt->next);
		new1->prev=pt;
		new1->next=pt->next;
		pt->next=new1;
		new1->next->prev=new1;
	}
return p;
}
node *del(node *p)
{
	int ch,x;
	node *pt,*pt1;
	printf("\n 1.Delete head\n 2. Delete specific");
	printf("\n Enter ur choice:");
	scanf("%d",&ch);
	if(ch==1)
	{
		pt=p;
		p=p->next;
		free(pt);
	}
	else if(ch==2)
	{
		printf("\n Enter the node value which you want to delete");
		scanf("%d",&x);
		for(pt=p;pt->next->no!=x;pt=pt->next);
		pt1=pt->next;
		pt->next=pt->next->next;
		free(pt1);
	}
	return p;
}
























