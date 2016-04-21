package com.inputstick.api.layout;

public class FrenchLinuxLayout extends KeyboardLayout {
	
	public static final String LOCALE_NAME = "fr-FR-linux";
	
	//{char (16b unicode), modifier, key, deadkey_modifier, deadkey}
	//fr-FR
	private static final int[][] FAST_LUT = {
		{    0,	    0,	    0,	    0,	    0	},	// empty
		{   27,	    1,	   47,	    0,	    0	},	// 
		{   28,	    1,	   49,	    0,	    0	},	// 
		{   29,	    1,	   48,	    0,	    0	},	// 
		{   32,	    0,	   44,	    0,	    0	},	//  
		{   33,	    0,	   56,	    0,	    0	},	// !
		{   34,	    0,	   32,	    0,	    0	},	// "
		{   35,	   64,	   32,	    0,	    0	},	// #
		{   36,	    0,	   48,	    0,	    0	},	// $
		{   37,	    2,	   52,	    0,	    0	},	// %
		{   38,	    0,	   30,	    0,	    0	},	// &
		{   39,	    0,	   33,	    0,	    0	},	// '
		{   40,	    0,	   34,	    0,	    0	},	// (
		{   41,	    0,	   45,	    0,	    0	},	// )
		{   42,	    0,	   49,	    0,	    0	},	// *
		{   43,	    2,	   46,	    0,	    0	},	// +
		{   44,	    0,	   16,	    0,	    0	},	// ,
		{   45,	    0,	   35,	    0,	    0	},	// -
		{   46,	    2,	   54,	    0,	    0	},	// .
		{   47,	    2,	   55,	    0,	    0	},	// /
		{   48,	    2,	   39,	    0,	    0	},	// 0
		{   49,	    2,	   30,	    0,	    0	},	// 1
		{   50,	    2,	   31,	    0,	    0	},	// 2
		{   51,	    2,	   32,	    0,	    0	},	// 3
		{   52,	    2,	   33,	    0,	    0	},	// 4
		{   53,	    2,	   34,	    0,	    0	},	// 5
		{   54,	    2,	   35,	    0,	    0	},	// 6
		{   55,	    2,	   36,	    0,	    0	},	// 7
		{   56,	    2,	   37,	    0,	    0	},	// 8
		{   57,	    2,	   38,	    0,	    0	},	// 9
		{   58,	    0,	   55,	    0,	    0	},	// :
		{   59,	    0,	   54,	    0,	    0	},	// ;
		{   60,	    0,	  100,	    0,	    0	},	// <
		{   61,	    0,	   46,	    0,	    0	},	// =
		{   62,	    2,	  100,	    0,	    0	},	// >
		{   63,	    2,	   16,	    0,	    0	},	// ?
		{   64,	   64,	   39,	    0,	    0	},	// @
		{   65,	    2,	   20,	    0,	    0	},	// A
		{   66,	    2,	    5,	    0,	    0	},	// B
		{   67,	    2,	    6,	    0,	    0	},	// C
		{   68,	    2,	    7,	    0,	    0	},	// D
		{   69,	    2,	    8,	    0,	    0	},	// E
		{   70,	    2,	    9,	    0,	    0	},	// F
		{   71,	    2,	   10,	    0,	    0	},	// G
		{   72,	    2,	   11,	    0,	    0	},	// H
		{   73,	    2,	   12,	    0,	    0	},	// I
		{   74,	    2,	   13,	    0,	    0	},	// J
		{   75,	    2,	   14,	    0,	    0	},	// K
		{   76,	    2,	   15,	    0,	    0	},	// L
		{   77,	    2,	   51,	    0,	    0	},	// M
		{   78,	    2,	   17,	    0,	    0	},	// N
		{   79,	    2,	   18,	    0,	    0	},	// O
		{   80,	    2,	   19,	    0,	    0	},	// P
		{   81,	    2,	    4,	    0,	    0	},	// Q
		{   82,	    2,	   21,	    0,	    0	},	// R
		{   83,	    2,	   22,	    0,	    0	},	// S
		{   84,	    2,	   23,	    0,	    0	},	// T
		{   85,	    2,	   24,	    0,	    0	},	// U
		{   86,	    2,	   25,	    0,	    0	},	// V
		{   87,	    2,	   29,	    0,	    0	},	// W
		{   88,	    2,	   27,	    0,	    0	},	// X
		{   89,	    2,	   28,	    0,	    0	},	// Y
		{   90,	    2,	   26,	    0,	    0	},	// Z
		{   91,	   64,	   34,	    0,	    0	},	// [
		{   92,	   64,	   37,	    0,	    0	},	// \
		{   93,	   64,	   45,	    0,	    0	},	// ]
		{   94,	   64,	   38,	    0,	    0	},	// ^  fixed! "deadkey" is duplicated in this layout! 
		{   95,	    0,	   37,	    0,	    0	},	// _
		{   96,	    0,	   44,	   64,	   36	},	// `
		{   97,	    0,	   20,	    0,	    0	},	// a
		{   98,	    0,	    5,	    0,	    0	},	// b
		{   99,	    0,	    6,	    0,	    0	},	// c
		{  100,	    0,	    7,	    0,	    0	},	// d
		{  101,	    0,	    8,	    0,	    0	},	// e
		{  102,	    0,	    9,	    0,	    0	},	// f
		{  103,	    0,	   10,	    0,	    0	},	// g
		{  104,	    0,	   11,	    0,	    0	},	// h
		{  105,	    0,	   12,	    0,	    0	},	// i
		{  106,	    0,	   13,	    0,	    0	},	// j
		{  107,	    0,	   14,	    0,	    0	},	// k
		{  108,	    0,	   15,	    0,	    0	},	// l
		{  109,	    0,	   51,	    0,	    0	},	// m
		{  110,	    0,	   17,	    0,	    0	},	// n
		{  111,	    0,	   18,	    0,	    0	},	// o
		{  112,	    0,	   19,	    0,	    0	},	// p
		{  113,	    0,	    4,	    0,	    0	},	// q
		{  114,	    0,	   21,	    0,	    0	},	// r
		{  115,	    0,	   22,	    0,	    0	},	// s
		{  116,	    0,	   23,	    0,	    0	},	// t
		{  117,	    0,	   24,	    0,	    0	},	// u
		{  118,	    0,	   25,	    0,	    0	},	// v
		{  119,	    0,	   29,	    0,	    0	},	// w
		{  120,	    0,	   27,	    0,	    0	},	// x
		{  121,	    0,	   28,	    0,	    0	},	// y
		{  122,	    0,	   26,	    0,	    0	},	// z
		{  123,	   64,	   33,	    0,	    0	},	// {
		{  124,	   64,	   35,	    0,	    0	},	// |
		{  125,	   64,	   46,	    0,	    0	},	// }
		{  126,	    0,	   44,	   64,	   31	},	// ~
		{  163,	    2,	   48,	    0,	    0	},	// ?
		{  164,	   64,	   48,	    0,	    0	},	// �
		{  167,	    2,	   56,	    0,	    0	},	// �
		{  168,	    0,	   44,	    2,	   47	},	// �
		{  176,	    2,	   45,	    0,	    0	},	// �
		{  178,	    0,	   53,	    0,	    0	},	// ?
		{  181,	    2,	   49,	    0,	    0	},	// �
		{  192,	    2,	   20,	   64,	   36	},	// ?
		{  194,	    2,	   20,	   64,	   38	},	// �
		{  195,	    2,	   20,	   64,	   31	},	// ?
		{  196,	    2,	   20,	    2,	   47	},	// �
		{  200,	    2,	    8,	   64,	   36	},	// ?
		{  202,	    2,	    8,	   64,	   38	},	// ?
		{  203,	    2,	    8,	    2,	   47	},	// �
		{  204,	    2,	   12,	   64,	   36	},	// ?
		{  206,	    2,	   12,	   64,	   38	},	// �
		{  207,	    2,	   12,	    2,	   47	},	// ?
		{  209,	    2,	   17,	   64,	   31	},	// ?
		{  210,	    2,	   18,	   64,	   36	},	// ?
		{  212,	    2,	   18,	   64,	   38	},	// �
		{  213,	    2,	   18,	   64,	   31	},	// ?
		{  214,	    2,	   18,	    2,	   47	},	// �
		{  217,	    2,	   24,	   64,	   36	},	// ?
		{  219,	    2,	   24,	   64,	   38	},	// ?
		{  220,	    2,	   24,	    2,	   47	},	// �
		{  224,	    0,	   39,	    0,	    0	},	// ?
		{  226,	    0,	   20,	   64,	   38	},	// �
		{  227,	    0,	   20,	   64,	   31	},	// ?
		{  228,	    0,	   20,	    2,	   47	},	// �
		{  231,	    0,	   38,	    0,	    0	},	// �
		{  232,	    0,	   36,	    0,	    0	},	// ?
		{  233,	    0,	   31,	    0,	    0	},	// �
		{  234,	    0,	    8,	   64,	   38	},	// ?
		{  235,	    0,	    8,	    2,	   47	},	// �
		{  236,	    0,	   12,	   64,	   36	},	// ?
		{  238,	    0,	   12,	   64,	   38	},	// �
		{  239,	    0,	   12,	    2,	   47	},	// ?
		{  241,	    0,	   17,	   64,	   31	},	// ?
		{  242,	    0,	   18,	   64,	   36	},	// ?
		{  244,	    0,	   18,	   64,	   38	},	// �
		{  245,	    0,	   18,	   64,	   31	},	// ?
		{  246,	    0,	   18,	    2,	   47	},	// �
		{  249,	    0,	   52,	    0,	    0	},	// ?
		{  251,	    0,	   24,	   64,	   38	},	// ?
		{  252,	    0,	   24,	    2,	   47	},	// �
		{  255,	    0,	   28,	    2,	   47	},	// ?
		{ 8364,	   64,	    8,	    0,	    0	},	// �
	};	
		
	public static final int LUT[][] = {
		/*	0	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	1	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	2	*/	{	1	,	0x26		,	(int)'1'	,	-1		,	-1		,	-1	}	,
		/*	3	*/	{	1	,	0x00e9		,	(int)'2'	,	-1		,	0x007e	,	-1	}	,
		/*	4	*/	{	1	,	0x22		,	(int)'3'	,	-1		,	0x23	,	-1	}	,
		/*	5	*/	{	1	,	0x27		,	(int)'4'	,	-1		,	0x007b	,	-1	}	,
		/*	6	*/	{	1	,	0x28		,	(int)'5'	,	-1		,	0x005b	,	-1	}	,
		/*	7	*/	{	1	,	0x002d		,	(int)'6'	,	-1		,	0x007c	,	-1	}	,
		/*	8	*/	{	1	,	0x00e8		,	(int)'7'	,	-1		,	0x0060	,	-1	}	,
		/*	9	*/	{	1	,	0x005f		,	(int)'8'	,	-1		,	0x005c	,	-1	}	,
		/*	0a	*/	{	1	,	0x00e7		,	(int)'9'	,	-1		,	0x005e	,	-1	}	,
		/*	0b	*/	{	1	,	0x00e0		,	(int)'0'	,	-1		,	0x40	,	-1	}	,
		/*	0c	*/	{	1	,	0x29		,	0x00b0		,	-1		,	0x005d	,	-1	}	,
		/*	0d	*/	{	1	,	0x003d		,	0x002b		,	-1		,	0x007d	,	-1	}	,
		/*	1e	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,		
		/*	1f	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,				
		
		/*	10	*/	{	1	,	(int)'a'	,	(int)'A'	,	-1	,	-1			,	-1	}	,
		/*	11	*/	{	1	,	(int)'z'	,	(int)'Z'	,	-1	,	-1			,	-1	}	,
		/*	12	*/	{	1	,	(int)'e'	,	(int)'E'	,	-1	,	0x20ac		,	-1	}	,
		/*	13	*/	{	1	,	(int)'r'	,	(int)'R'	,	-1	,	-1			,	-1	}	,
		/*	14	*/	{	1	,	(int)'t'	,	(int)'T'	,	-1	,	-1			,	-1	}	,
		/*	15	*/	{	1	,	(int)'y'	,	(int)'Y'	,	-1	,	-1			,	-1	}	,
		/*	16	*/	{	1	,	(int)'u'	,	(int)'U'	,	-1	,	-1			,	-1	}	,
		/*	17	*/	{	1	,	(int)'i'	,	(int)'I'	,	-1	,	-1			,	-1	}	,
		/*	18	*/	{	1	,	(int)'o'	,	(int)'O'	,	-1	,	-1			,	-1	}	,
		/*	19	*/	{	1	,	(int)'p'	,	(int)'P'	,	-1	,	-1			,	-1	}	,
		/*	1a	*/	{	1	,	0x005e		,	0x00a8		,	0x001b	,	-1		,	-1	}	,
		/*	1b	*/	{	1	,	0x24		,	0x00a3		,	0x001d	,	0x00a4	,	-1	}	,
		/*	1c	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,		
		/*	1d	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,		
		/*	1e	*/	{	1	,	(int)'q'	,	(int)'Q'	,	-1		,	-1		,	-1	}	,
		/*	1f	*/	{	1	,	(int)'s'	,	(int)'S'	,	-1		,	-1		,	-1	}	,
		
		/*	20	*/	{	1	,	(int)'d'	,	(int)'D'	,	-1		,	-1		,	-1	}	,
		/*	21	*/	{	1	,	(int)'f'	,	(int)'F'	,	-1		,	-1		,	-1	}	,
		/*	22	*/	{	1	,	(int)'g'	,	(int)'G'	,	-1		,	-1		,	-1	}	,
		/*	23	*/	{	1	,	(int)'h'	,	(int)'H'	,	-1		,	-1		,	-1	}	,
		/*	24	*/	{	1	,	(int)'j'	,	(int)'J'	,	-1		,	-1		,	-1	}	,
		/*	25	*/	{	1	,	(int)'k'	,	(int)'K'	,	-1		,	-1		,	-1	}	,
		/*	26	*/	{	1	,	(int)'l'	,	(int)'L'	,	-1		,	-1		,	-1	}	,
		/*	27	*/	{	1	,	(int)'m'	,	(int)'M'	,	-1		,	-1		,	-1	}	,
		/*	28	*/	{	1	,	0x00f9		,	0x25		,	-1		,	-1		,	-1	}	,
		/*	29	*/	{	0	,	0x00b2		,	-1			,	-1		,	-1		,	-1	}	,
		/*	2a	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,		
		/*	2b	*/	{	1	,	0x002a		,	0x00b5		,	0x001c	,	-1		,	-1	}	,
		/*	2c	*/	{	1	,	(int)'w'	,	(int)'W'	,	-1		,	-1		,	-1	}	,
		/*	2d	*/	{	1	,	(int)'x'	,	(int)'X'	,	-1		,	-1		,	-1	}	,
		/*	2e	*/	{	1	,	(int)'c'	,	(int)'C'	,	-1		,	-1		,	-1	}	,
		/*	2f	*/	{	1	,	(int)'v'	,	(int)'V'	,	-1		,	-1		,	-1	}	,
		
		
		/*	30	*/	{	1	,	(int)'b'	,	(int)'B'	,	-1		,	-1		,	-1	}	,
		/*	31	*/	{	1	,	(int)'n'	,	(int)'N'	,	-1		,	-1		,	-1	}	,
		/*	32	*/	{	1	,	0x002c		,	0x003f		,	-1		,	-1		,	-1	}	,
		/*	33	*/	{	1	,	0x003b		,	0x002e		,	-1		,	-1		,	-1	}	,
		/*	34	*/	{	1	,	0x003a		,	0x002f		,	-1		,	-1		,	-1	}	,
		/*	35	*/	{	1	,	0x21		,	0x00a7		,	-1		,	-1		,	-1	}	,
		/*	36	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	37	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	38	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,	
		/*	39	*/	{	0	,	0x20		,	0x20		,	0x20	,	-1		,	-1	}	,
		/*	3a	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	3b	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	3c	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	3d	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	3e	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	3f	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,		
		
		/*	40	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	41	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	42	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	43	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	44	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	45	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	46	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	47	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,	
		/*	48	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	49	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	4a	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	4b	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	4c	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	4d	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	4e	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	4f	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		
		/*	50	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	51	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	52	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	53	*/	{	0	,	0x002e		,	0x002e		,	-1		,	-1		,	-1	}	,
		/*	54	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	55	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	56	*/	{	0	,	0x003c		,	0x003e		,	0x001c	,	-1		,	-1	}	,		
		/*	57	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,	
		/*	58	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	59	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	5a	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	5b	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	5c	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	5d	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	5e	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,
		/*	5f	*/	{	-1	,	0			,	0			,	0		,	0		,	0	}	,		
		
	};
	
	public static final int DEADKEYS[] = {
		0x005e, 0x00a8
	};
	
	public static final int DEADKEY_LUT[][] = {
		{	0x005e	,	0x0065	,	0x00ea	}	,
		{	0x005e	,	0x0075	,	0x00fb	}	,
		{	0x005e	,	0x0069	,	0x00ee	}	,
		{	0x005e	,	0x006f	,	0x00f4	}	,
		{	0x005e	,	0x0061	,	0x00e2	}	,
		{	0x005e	,	0x0045	,	0x00ca	}	,
		{	0x005e	,	0x0055	,	0x00db	}	,
		{	0x005e	,	0x0049	,	0x00ce	}	,
		{	0x005e	,	0x004f	,	0x00d4	}	,
		{	0x005e	,	0x0041	,	0x00c2	}	,
		{	0x005e	,	0x0020	,	0x005e	}	,
		{	0x00a8	,	0x0065	,	0x00eb	}	,
		{	0x00a8	,	0x0075	,	0x00fc	}	,
		{	0x00a8	,	0x0069	,	0x00ef	}	,
		{	0x00a8	,	0x0079	,	0x00ff	}	,
		{	0x00a8	,	0x006f	,	0x00f6	}	,
		{	0x00a8	,	0x0061	,	0x00e4	}	,
		{	0x00a8	,	0x0045	,	0x00cb	}	,
		{	0x00a8	,	0x0055	,	0x00dc	}	,
		{	0x00a8	,	0x0049	,	0x00cf	}	,
		{	0x00a8	,	0x004f	,	0x00d6	}	,
		{	0x00a8	,	0x0041	,	0x00c4	}	,
		{	0x00a8	,	0x0020	,	0x00a8	}	,
	};	
	
	private static FrenchLinuxLayout instance = new FrenchLinuxLayout();
	
	private FrenchLinuxLayout() {
	}
	
	public static FrenchLinuxLayout getInstance() {
		return instance;
	}	
	
	@Override
	public int[][] getLUT() {
		return LUT;
	}

	@Override
	public int[][] getFastLUT() {
		return FAST_LUT;
	}

	@Override
	public void type(String text) {
		super.type(FAST_LUT, text, (byte)0);
	}	
	
	@Override
	public void type(String text, byte modifiers) {
		super.type(FAST_LUT, text, modifiers);
	}
	
	@Override
	public char getChar(int scanCode, boolean capsLock, boolean shift, boolean altGr) {
		return super.getChar(LUT, scanCode, capsLock, shift, altGr);
	}	
	
	@Override
	public String getLocaleName() {		
		return LOCALE_NAME;
	}	
	
	@Override
	public int[][] getDeadkeyLUT() {		
		return DEADKEY_LUT;
	}

	@Override
	public int[] getDeadkeys() {
		return DEADKEYS;
	}

}

