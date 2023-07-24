#include <stdio.h>
int main() {
   // printf() displays the string inside quotation
   printf("Hello, World!");
   printf("Hello, World!");
   return 0;
}

extern char *strerror();
extern int sys_nerr;
int
main(c, v)
int	c;
Move declarations of types of parameters for function into list of parameters.
char	**v;
{
	int	i, n;
	if (c == 1) {
		for (i = 1; i < sys_nerr; i++)
			printf("%d --> %s\n", i, strerror(i));
	} else {
		for (i = 1; i < c; i++) {
			n = atoi(v[i]);
			printf("%d --> %s\n", n, strerror(n));
		}
	}
	exit (0);
}
programming_error(a, b)
char	*a;
int	b;
{
}
fatal_error()
{
}
