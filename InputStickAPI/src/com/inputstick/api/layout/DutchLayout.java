package com.inputstick.api.layout;

public class DutchLayout extends KeyboardLayout {
	
	public static final String LOCALE_NAME = "nl-NL";
	
	//{char (16b unicode), modifier, key, deadkey_modifier, deadkey}
	//nl-NL, same as en International
	private static final int[][] FAST_LUT = {
		{   27,	    1,	   47,	    0,	    0	},	// 
		{   28,	    1,	   49,	    0,	    0	},	// 
		{   29,	    1,	   48,	    0,	    0	},	// 
		{   32,	    0,	   44,	    0,	    0	},	//  
		{   33,	    2,	   30,	    0,	    0	},	// !
		{   34,	    0,	   44,	    2,	   52	},	// "
		{   35,	    2,	   32,	    0,	    0	},	// #
		{   36,	    2,	   33,	    0,	    0	},	// $
		{   37,	    2,	   34,	    0,	    0	},	// %
		{   38,	    2,	   36,	    0,	    0	},	// &
		{   39,	    0,	   44,	    0,	   52	},	// '
		{   40,	    2,	   38,	    0,	    0	},	// (
		{   41,	    2,	   39,	    0,	    0	},	// )
		{   42,	    2,	   37,	    0,	    0	},	// *
		{   43,	    2,	   46,	    0,	    0	},	// +
		{   44,	    0,	   54,	    0,	    0	},	// ,
		{   45,	    0,	   45,	    0,	    0	},	// -
		{   46,	    0,	   55,	    0,	    0	},	// .
		{   47,	    0,	   56,	    0,	    0	},	// /
		{   48,	    0,	   39,	    0,	    0	},	// 0
		{   49,	    0,	   30,	    0,	    0	},	// 1
		{   50,	    0,	   31,	    0,	    0	},	// 2
		{   51,	    0,	   32,	    0,	    0	},	// 3
		{   52,	    0,	   33,	    0,	    0	},	// 4
		{   53,	    0,	   34,	    0,	    0	},	// 5
		{   54,	    0,	   35,	    0,	    0	},	// 6
		{   55,	    0,	   36,	    0,	    0	},	// 7
		{   56,	    0,	   37,	    0,	    0	},	// 8
		{   57,	    0,	   38,	    0,	    0	},	// 9
		{   58,	    2,	   51,	    0,	    0	},	// :
		{   59,	    0,	   51,	    0,	    0	},	// ;
		{   60,	    2,	   54,	    0,	    0	},	// <
		{   61,	    0,	   46,	    0,	    0	},	// =
		{   62,	    2,	   55,	    0,	    0	},	// >
		{   63,	    2,	   56,	    0,	    0	},	// ?
		{   64,	    2,	   31,	    0,	    0	},	// @
		{   65,	    2,	    4,	    0,	    0	},	// A
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
		{   77,	    2,	   16,	    0,	    0	},	// M
		{   78,	    2,	   17,	    0,	    0	},	// N
		{   79,	    2,	   18,	    0,	    0	},	// O
		{   80,	    2,	   19,	    0,	    0	},	// P
		{   81,	    2,	   20,	    0,	    0	},	// Q
		{   82,	    2,	   21,	    0,	    0	},	// R
		{   83,	    2,	   22,	    0,	    0	},	// S
		{   84,	    2,	   23,	    0,	    0	},	// T
		{   85,	    2,	   24,	    0,	    0	},	// U
		{   86,	    2,	   25,	    0,	    0	},	// V
		{   87,	    2,	   26,	    0,	    0	},	// W
		{   88,	    2,	   27,	    0,	    0	},	// X
		{   89,	    2,	   28,	    0,	    0	},	// Y
		{   90,	    2,	   29,	    0,	    0	},	// Z
		{   91,	    0,	   47,	    0,	    0	},	// [
		{   92,	    0,	   49,	    0,	    0	},	// backslash
		{   93,	    0,	   48,	    0,	    0	},	// ]
		{   94,	    0,	   44,	    2,	   35	},	// ^
		{   95,	    2,	   45,	    0,	    0	},	// _
		{   96,	    0,	   53,	    0,	    0	},	// `
		{   97,	    0,	    4,	    0,	    0	},	// a
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
		{  109,	    0,	   16,	    0,	    0	},	// m
		{  110,	    0,	   17,	    0,	    0	},	// n
		{  111,	    0,	   18,	    0,	    0	},	// o
		{  112,	    0,	   19,	    0,	    0	},	// p
		{  113,	    0,	   20,	    0,	    0	},	// q
		{  114,	    0,	   21,	    0,	    0	},	// r
		{  115,	    0,	   22,	    0,	    0	},	// s
		{  116,	    0,	   23,	    0,	    0	},	// t
		{  117,	    0,	   24,	    0,	    0	},	// u
		{  118,	    0,	   25,	    0,	    0	},	// v
		{  119,	    0,	   26,	    0,	    0	},	// w
		{  120,	    0,	   27,	    0,	    0	},	// x
		{  121,	    0,	   28,	    0,	    0	},	// y
		{  122,	    0,	   29,	    0,	    0	},	// z
		{  123,	    2,	   47,	    0,	    0	},	// {
		{  124,	    2,	   49,	    0,	    0	},	// |
		{  125,	    2,	   48,	    0,	    0	},	// }
		{  126,	    2,	   53,	    0,	    0	},	// ~
		{  161,	   64,	   30,	    0,	    0	},	// ¡
		{  162,	   66,	    6,	    0,	    0	},	// ¢
		{  163,	   66,	   33,	    0,	    0	},	// £
		{  164,	   64,	   33,	    0,	    0	},	// ¤
		{  165,	   64,	   45,	    0,	    0	},	// ¥
		{  166,	   66,	   49,	    0,	    0	},	// ¦
		{  167,	   66,	   22,	    0,	    0	},	// §
		{  168,	   66,	   52,	    0,	    0	},	// ¨
		{  169,	   64,	    6,	    0,	    0	},	// ©
		{  171,	   64,	   47,	    0,	    0	},	// «
		{  172,	   64,	   49,	    0,	    0	},	// ¬
		{  174,	   64,	   21,	    0,	    0	},	// ®
		{  176,	   66,	   51,	    0,	    0	},	// °
		{  178,	   64,	   31,	    0,	    0	},	// ²
		{  179,	   64,	   32,	    0,	    0	},	// ³
		{  180,	   64,	   52,	    0,	    0	},	// ´
		{  181,	   64,	   16,	    0,	    0	},	// µ
		{  182,	   64,	   51,	    0,	    0	},	// ¶
		{  185,	   66,	   30,	    0,	    0	},	// ¹
		{  187,	   64,	   48,	    0,	    0	},	// »
		{  188,	   64,	   35,	    0,	    0	},	// ¼
		{  189,	   64,	   36,	    0,	    0	},	// ½
		{  190,	   64,	   37,	    0,	    0	},	// ¾
		{  191,	   64,	   56,	    0,	    0	},	// ¿
		{  193,	   66,	    4,	    0,	    0	},	// Á
		{  194,	    2,	    4,	    2,	   35	},	// Â
		{  196,	   66,	   20,	    0,	    0	},	// Ä
		{  197,	   66,	   26,	    0,	    0	},	// Å
		{  198,	   66,	   29,	    0,	    0	},	// Æ
		{  199,	   66,	   54,	    0,	    0	},	// Ç
		{  201,	   66,	    8,	    0,	    0	},	// É
		{  202,	    2,	    8,	    2,	   35	},	// Ê
		{  203,	    2,	    8,	    2,	   52	},	// Ë
		{  205,	   66,	   12,	    0,	    0	},	// Í
		{  206,	    2,	   12,	    2,	   35	},	// Î
		{  207,	    2,	   12,	    2,	   52	},	// Ï
		{  208,	   66,	    7,	    0,	    0	},	// Ð
		{  209,	   66,	   17,	    0,	    0	},	// Ñ
		{  211,	   66,	   18,	    0,	    0	},	// Ó
		{  212,	    2,	   18,	    2,	   35	},	// Ô
		{  214,	   66,	   19,	    0,	    0	},	// Ö
		{  215,	   64,	   46,	    0,	    0	},	// ×
		{  216,	   66,	   15,	    0,	    0	},	// Ø
		{  218,	   66,	   24,	    0,	    0	},	// Ú
		{  219,	    2,	   24,	    2,	   35	},	// Û
		{  220,	   66,	   28,	    0,	    0	},	// Ü
		{  221,	    2,	   28,	    0,	   52	},	// Ý
		{  222,	   66,	   23,	    0,	    0	},	// Þ
		{  223,	   64,	   22,	    0,	    0	},	// ß
		{  225,	   64,	    4,	    0,	    0	},	// á
		{  226,	    0,	    4,	    2,	   35	},	// â
		{  228,	   64,	   20,	    0,	    0	},	// ä
		{  229,	   64,	   26,	    0,	    0	},	// å
		{  230,	   64,	   29,	    0,	    0	},	// æ
		{  231,	   64,	   54,	    0,	    0	},	// ç
		{  233,	   64,	    8,	    0,	    0	},	// é
		{  234,	    0,	    8,	    2,	   35	},	// ê
		{  235,	    0,	    8,	    2,	   52	},	// ë
		{  237,	   64,	   12,	    0,	    0	},	// í
		{  238,	    0,	   12,	    2,	   35	},	// î
		{  239,	    0,	   12,	    2,	   52	},	// ï
		{  240,	   64,	    7,	    0,	    0	},	// ð
		{  241,	   64,	   17,	    0,	    0	},	// ñ
		{  243,	   64,	   18,	    0,	    0	},	// ó
		{  244,	    0,	   18,	    2,	   35	},	// ô
		{  246,	   64,	   19,	    0,	    0	},	// ö
		{  247,	   66,	   46,	    0,	    0	},	// ÷
		{  248,	   64,	   15,	    0,	    0	},	// ø
		{  250,	   64,	   24,	    0,	    0	},	// ú
		{  251,	    0,	   24,	    2,	   35	},	// û
		{  252,	   64,	   28,	    0,	    0	},	// ü
		{  253,	    0,	   28,	    0,	   52	},	// ý
		{  254,	   64,	   23,	    0,	    0	},	// þ
		{  255,	    0,	   28,	    2,	   52	},	// ÿ
		{ 8216,	   64,	   38,	    0,	    0	},	// ‘
		{ 8217,	   64,	   39,	    0,	    0	},	// ’
		{ 8364,	   64,	   34,	    0,	    0	},	// €
	};	
	
	public static final int LUT[][] = {
		/*	0	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	1	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,						
		/*	02	*/	{	0	,	(int)'1'	,	0x0021		,	-1		,	0x00a1	,	0x00b9	}	,
		/*	03	*/	{	0	,	(int)'2'	,	0x0040		,	-1		,	0x00b2	,	-1		}	,
		/*	04	*/	{	0	,	(int)'3'	,	0x0023		,	-1		,	0x00b3	,	-1		}	,
		/*	05	*/	{	0	,	(int)'4'	,	0x0024		,	-1		,	0x00a4	,	0x00a3	}	,
		/*	06	*/	{	0	,	(int)'5'	,	0x0025		,	-1		,	0x20ac	,	-1		}	,
		/*	07	*/	{	0	,	(int)'6'	,	0x005e		,	-1		,	0x00bc	,	-1		}	,
		/*	08	*/	{	0	,	(int)'7'	,	0x0026		,	-1		,	0x00bd	,	-1		}	,
		/*	09	*/	{	0	,	(int)'8'	,	0x002a		,	-1		,	0x00be	,	-1		}	,
		/*	0a	*/	{	0	,	(int)'9'	,	0x0028		,	-1		,	0x2018	,	-1		}	,
		/*	0b	*/	{	0	,	(int)'0'	,	0x0029		,	-1		,	0x2019	,	-1		}	,
		/*	0c	*/	{	0	,	0x002d		,	0x005f		,	-1		,	0x00a5	,	-1		}	,
		/*	0d	*/	{	0	,	0x003d		,	0x002b		,	-1		,	0x00d7	,	0x00f7	}	,
		/*	0e	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	0f	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,		
				
		/*	10	*/	{	5	,	(int)'q'	,	(int)'Q'	,	-1		,	0x00e4	,	0x00c4	}	,
		/*	11	*/	{	5	,	(int)'w'	,	(int)'W'	,	-1		,	0x00e5	,	0x00c5	}	,
		/*	12	*/	{	5	,	(int)'e'	,	(int)'E'	,	-1		,	0x00e9	,	0x00c9	}	,
		/*	13	*/	{	1	,	(int)'r'	,	(int)'R'	,	-1		,	0x00ae	,	-1		}	,
		/*	14	*/	{	5	,	(int)'t'	,	(int)'T'	,	-1		,	0x00fe	,	0x00de	}	,
		/*	15	*/	{	5	,	(int)'y'	,	(int)'Y'	,	-1		,	0x00fc	,	0x00dc	}	,
		/*	16	*/	{	5	,	(int)'u'	,	(int)'U'	,	-1		,	0x00fa	,	0x00da	}	,
		/*	17	*/	{	5	,	(int)'i'	,	(int)'I'	,	-1		,	0x00ed	,	0x00cd	}	,
		/*	18	*/	{	5	,	(int)'o'	,	(int)'O'	,	-1		,	0x00f3	,	0x00d3	}	,
		/*	19	*/	{	5	,	(int)'p'	,	(int)'P'	,	-1		,	0x00f6	,	0x00d6	}	,
		/*	1a	*/	{	0	,	0x005b		,	0x007b		,	0x001b	,	0x00ab	,	-1		}	,
		/*	1b	*/	{	0	,	0x005d		,	0x007d		,	0x001d	,	0x00bb	,	-1		}	,
		/*	1c	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	1d	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,			
		/*	1e	*/	{	5	,	(int)'a'	,	(int)'A'	,	-1		,	0x00e1	,	0x00c1	}	,
		/*	1f	*/	{	1	,	(int)'s'	,	(int)'S'	,	-1		,	0x00df	,	0x00a7	}	,		
		
		/*	20	*/	{	5	,	(int)'d'	,	(int)'D'	,	-1		,	0x00f0	,	0x00d0	}	,
		/*	21	*/	{	1	,	(int)'f'	,	(int)'F'	,	-1		,	-1		,	-1		}	,
		/*	22	*/	{	1	,	(int)'g'	,	(int)'G'	,	-1		,	-1		,	-1		}	,
		/*	23	*/	{	1	,	(int)'h'	,	(int)'H'	,	-1		,	-1		,	-1		}	,
		/*	24	*/	{	1	,	(int)'j'	,	(int)'J'	,	-1		,	-1		,	-1		}	,
		/*	25	*/	{	1	,	(int)'k'	,	(int)'K'	,	-1		,	-1		,	-1		}	,
		/*	26	*/	{	5	,	(int)'l'	,	(int)'L'	,	-1		,	0x00f8	,	0x00d8	}	,
		/*	27	*/	{	0	,	0x003b		,	0x003a		,	-1		,	0x00b6	,	0x00b0	}	,
		/*	28	*/	{	0	,	0x0027		,	0x0022		,	-1		,	0x00b4	,	0x00a8	}	,
		/*	29	*/	{	0	,	0x0060		,	0x007e		,	-1		,	-1		,	-1		}	,
		/*	2a	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,		
		/*	2b	*/	{	0	,	0x005c		,	0x007c		,	0x001c	,	0x00ac	,	0x00a6	}	,
		/*	2c	*/	{	5	,	(int)'z'	,	(int)'Z'	,	-1		,	0x00e6	,	0x00c6	}	,
		/*	2d	*/	{	1	,	(int)'x'	,	(int)'X'	,	-1		,	-1		,	-1		}	,
		/*	2e	*/	{	1	,	(int)'c'	,	(int)'C'	,	-1		,	0x00a9	,	0x00a2	}	,
		/*	2f	*/	{	1	,	(int)'v'	,	(int)'V'	,	-1		,	-1		,	-1		}	,
						
		/*	30	*/	{	1	,	(int)'b'	,	(int)'B'	,	-1		,	-1		,	-1		}	,
		/*	31	*/	{	5	,	(int)'n'	,	(int)'N'	,	-1		,	0x00f1	,	0x00d1	}	,
		/*	32	*/	{	1	,	(int)'m'	,	(int)'M'	,	-1		,	0x00b5	,	-1		}	,
		/*	33	*/	{	4	,	0x002c		,	0x003c		,	-1		,	0x00e7	,	0x00c7	}	,
		/*	34	*/	{	0	,	0x002e		,	0x003e		,	-1		,	-1		,	-1		}	,
		/*	35	*/	{	0	,	0x002f		,	0x003f		,	-1		,	0x00bf	,	-1		}	,
		/*	36	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	37	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	38	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,			
		/*	39	*/	{	0	,	0x0020		,	0x0020		,	0x0020	,	-1		,	-1		}	,
		/*	3a	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	3b	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	3c	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	3d	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	3e	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	3f	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,				
		
		/*	40	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	41	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	42	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	43	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	44	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	45	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	46	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	47	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,	
		/*	48	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	49	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	4a	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	4b	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	4c	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	4d	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	4e	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	4f	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,		
		
		/*	50	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	51	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,	
		/*	52	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	53	*/	{	0	,	0x002e		,	0x002e		,	-1		,	-1		,	-1		}	,
		/*	54	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	55	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,		
		/*	56	*/	{	0	,	0x005c		,	0x007c		,	0x001c	,	-1		,	-1		}	,		
		/*	57	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,	
		/*	58	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	59	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	5a	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	5b	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	5c	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	5d	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	5e	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	5f	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,						
	};
	
	public static final int DEADKEYS[] = {
		0x0022, 0x0027, 0x005e
	};
	
	public static final int DEADKEY_LUT[][] = {
		{	0x0022	,	0x0061	,	0x00e4	}	,
		{	0x0022	,	0x0065	,	0x00eb	}	,
		{	0x0022	,	0x0075	,	0x00fc	}	,
		{	0x0022	,	0x0069	,	0x00ef	}	,
		{	0x0022	,	0x0079	,	0x00ff	}	,
		{	0x0022	,	0x006f	,	0x00f6	}	,
		{	0x0022	,	0x0041	,	0x00c4	}	,
		{	0x0022	,	0x0045	,	0x00cb	}	,
		{	0x0022	,	0x0055	,	0x00dc	}	,
		{	0x0022	,	0x0049	,	0x00cf	}	,
		{	0x0022	,	0x004f	,	0x00d6	}	,
		{	0x0022	,	0x0020	,	0x0022	}	,
		{	0x0027	,	0x0063	,	0x00e7	}	,
		{	0x0027	,	0x0061	,	0x00e1	}	,
		{	0x0027	,	0x0065	,	0x00e9	}	,
		{	0x0027	,	0x0075	,	0x00fa	}	,
		{	0x0027	,	0x0069	,	0x00ed	}	,
		{	0x0027	,	0x0079	,	0x00fd	}	,
		{	0x0027	,	0x006f	,	0x00f3	}	,
		{	0x0027	,	0x0043	,	0x00c7	}	,
		{	0x0027	,	0x0041	,	0x00c1	}	,
		{	0x0027	,	0x0045	,	0x00c9	}	,
		{	0x0027	,	0x0055	,	0x00da	}	,
		{	0x0027	,	0x0049	,	0x00cd	}	,
		{	0x0027	,	0x0059	,	0x00dd	}	,
		{	0x0027	,	0x004f	,	0x00d3	}	,
		{	0x0027	,	0x0020	,	0x0027	}	,
		{	0x005e	,	0x0061	,	0x00e2	}	,
		{	0x005e	,	0x0065	,	0x00ea	}	,
		{	0x005e	,	0x0075	,	0x00fb	}	,
		{	0x005e	,	0x0069	,	0x00ee	}	,
		{	0x005e	,	0x006f	,	0x00f4	}	,
		{	0x005e	,	0x0041	,	0x00c2	}	,
		{	0x005e	,	0x0045	,	0x00ca	}	,
		{	0x005e	,	0x0055	,	0x00db	}	,
		{	0x005e	,	0x0049	,	0x00ce	}	,
		{	0x005e	,	0x004f	,	0x00d4	}	,
		{	0x005e	,	0x0020	,	0x005e	}	,		
	};
	
	private static DutchLayout instance = new DutchLayout();
	
	private DutchLayout() {
	}
	
	public static DutchLayout getInstance() {
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
