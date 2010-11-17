/* The following code was generated by JFlex 1.4.2 on 11/17/10 9:52 AM */

/*
* JBoss, Home of Professional Open Source
* Copyright 2008, Red Hat Middleware LLC, and individual contributors
* by the @authors tag. See the copyright.txt in the distribution for a
* full listing of individual contributors.
*
* This is free software; you can redistribute it and/or modify it
* under the terms of the GNU Lesser General Public License as
* published by the Free Software Foundation; either version 2.1 of
* the License, or (at your option) any later version.
*
* This software is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
* Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public
* License along with this software; if not, write to the Free
* Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
* 02110-1301 USA, or see the FSF site: http://www.fsf.org.
*
* @authors Andrew Dinn
*/

package org.jboss.byteman.rule.grammar;

import java_cup.runtime.*;
import org.jboss.byteman.rule.grammar.PrintableSymbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.2
 * on 11/17/10 9:52 AM from the specification file
 * <tt>dd/grammar/flex/ECAToken.flex</tt>
 */
public class ECATokenLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 2;
  public static final int QUOTEDIDENT = 4;
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\1\65\1\110"+
    "\1\106\1\5\1\103\1\64\1\111\1\52\1\53\1\73\1\10\1\57"+
    "\1\62\1\12\1\76\1\6\11\7\1\105\1\56\1\61\1\60\1\70"+
    "\1\104\1\107\1\42\1\13\1\4\1\16\1\37\1\23\1\31\1\30"+
    "\1\14\2\4\1\43\1\74\1\15\1\25\1\101\1\66\1\35\1\44"+
    "\1\27\1\36\1\77\1\50\3\4\1\54\1\112\1\55\1\71\1\4"+
    "\1\0\1\45\1\17\1\4\1\22\1\11\1\24\1\34\1\33\1\20"+
    "\2\4\1\46\1\75\1\21\1\26\1\102\1\67\1\40\1\47\1\32"+
    "\1\41\1\100\1\51\3\4\1\0\1\63\1\0\1\72\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\2\2\1\3\1\1\2\4\1\5\1\3"+
    "\1\6\27\3\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\2\3\1\27\2\3\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\36\2\43\1\44\1\45\2\46\3\47\2\0\1\50"+
    "\1\51\1\3\1\52\2\3\1\53\1\3\1\54\1\3"+
    "\1\53\5\3\1\55\3\3\1\23\1\56\6\3\1\16"+
    "\1\57\1\3\1\51\1\57\1\0\1\55\1\60\1\53"+
    "\1\56\6\3\1\61\1\62\1\63\1\64\2\50\1\0"+
    "\2\50\1\3\1\22\1\3\1\65\2\3\1\22\14\3"+
    "\1\60\1\15\1\3\1\30\3\3\1\66\1\3\1\67"+
    "\7\3\1\70\6\3\1\5\4\3\1\71\1\26\1\72"+
    "\2\3\1\17\1\3\1\27\1\3\1\73\1\74";

  private static int [] zzUnpackAction() {
    int [] result = new int[193];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\113\0\226\0\341\0\u012c\0\u0177\0\u012c\0\u01c2"+
    "\0\u020d\0\u0258\0\u02a3\0\u02ee\0\u0339\0\u012c\0\u0384\0\u03cf"+
    "\0\u041a\0\u0465\0\u04b0\0\u04fb\0\u0546\0\u0591\0\u05dc\0\u0627"+
    "\0\u0672\0\u06bd\0\u0708\0\u0753\0\u079e\0\u07e9\0\u0834\0\u087f"+
    "\0\u08ca\0\u0915\0\u0960\0\u09ab\0\u09f6\0\u012c\0\u012c\0\u012c"+
    "\0\u012c\0\u012c\0\u012c\0\u0a41\0\u0a8c\0\u02ee\0\u0ad7\0\u0b22"+
    "\0\u0b6d\0\u0bb8\0\u012c\0\u012c\0\u012c\0\u0c03\0\u0c4e\0\u012c"+
    "\0\u0c99\0\u0ce4\0\u012c\0\u012c\0\u012c\0\u012c\0\u012c\0\u012c"+
    "\0\u0d2f\0\u012c\0\u012c\0\u012c\0\u0d7a\0\u0dc5\0\u0e10\0\u012c"+
    "\0\u012c\0\u012c\0\u0e5b\0\u012c\0\u0ea6\0\u012c\0\u0ef1\0\u0f3c"+
    "\0\u0f87\0\u0fd2\0\u01c2\0\u101d\0\u01c2\0\u1068\0\u10b3\0\u10fe"+
    "\0\u1149\0\u01c2\0\u1194\0\u11df\0\u122a\0\u1275\0\u12c0\0\u130b"+
    "\0\u1356\0\u01c2\0\u13a1\0\u13ec\0\u1437\0\u01c2\0\u01c2\0\u1482"+
    "\0\u14cd\0\u1518\0\u1563\0\u15ae\0\u15f9\0\u01c2\0\u01c2\0\u1644"+
    "\0\u012c\0\u012c\0\u168f\0\u012c\0\u012c\0\u012c\0\u012c\0\u16da"+
    "\0\u1725\0\u1770\0\u17bb\0\u1806\0\u1851\0\u012c\0\u012c\0\u012c"+
    "\0\u012c\0\u012c\0\u189c\0\u18e7\0\u1932\0\u197d\0\u19c8\0\u1a13"+
    "\0\u1a5e\0\u01c2\0\u1aa9\0\u1af4\0\u1b3f\0\u1b8a\0\u1bd5\0\u1c20"+
    "\0\u1c6b\0\u1cb6\0\u1d01\0\u1d4c\0\u1d97\0\u1de2\0\u1e2d\0\u1e78"+
    "\0\u1ec3\0\u01c2\0\u012c\0\u1f0e\0\u01c2\0\u1f59\0\u1fa4\0\u1fef"+
    "\0\u01c2\0\u203a\0\u01c2\0\u2085\0\u20d0\0\u211b\0\u2166\0\u21b1"+
    "\0\u21fc\0\u2247\0\u01c2\0\u2292\0\u22dd\0\u2328\0\u2373\0\u23be"+
    "\0\u2409\0\u01c2\0\u2454\0\u249f\0\u24ea\0\u2535\0\u01c2\0\u01c2"+
    "\0\u01c2\0\u2580\0\u25cb\0\u01c2\0\u2616\0\u01c2\0\u2661\0\u01c2"+
    "\0\u01c2";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[193];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\5\1\6\2\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\10"+
    "\1\34\1\35\1\10\1\36\1\37\1\10\1\40\1\41"+
    "\1\10\1\42\1\43\1\10\1\44\1\45\3\10\1\46"+
    "\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
    "\1\57\1\60\1\61\2\10\1\62\1\63\1\64\1\65"+
    "\1\66\1\67\1\70\2\10\1\71\1\72\1\73\1\74"+
    "\1\75\1\76\1\5\1\77\1\100\1\5\1\101\1\102"+
    "\1\103\105\101\1\104\1\101\1\105\1\106\1\107\1\110"+
    "\106\106\1\111\1\106\1\112\1\113\1\114\110\112\115\0"+
    "\1\7\114\0\4\10\1\0\1\10\1\0\37\10\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\14\0\1\115\1\0"+
    "\1\116\1\117\1\120\1\115\1\0\37\115\10\0\1\120"+
    "\2\0\1\116\2\115\1\0\1\116\1\0\1\116\2\115"+
    "\1\0\4\115\3\0\2\116\14\0\1\121\1\122\24\0"+
    "\1\121\61\0\2\13\1\0\1\121\1\122\24\0\1\121"+
    "\61\0\1\12\1\13\107\0\4\10\1\0\1\10\1\0"+
    "\37\10\14\0\1\10\1\123\4\0\2\10\1\0\4\10"+
    "\14\0\4\10\1\0\1\10\1\0\1\10\1\124\35\10"+
    "\14\0\2\10\4\0\2\10\1\0\4\10\14\0\4\10"+
    "\1\0\1\10\1\0\10\10\1\125\26\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\14\0\4\10\1\0\1\10"+
    "\1\0\12\10\1\126\10\10\1\127\1\130\12\10\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\14\0\4\10\1\0"+
    "\1\10\1\0\1\10\1\131\10\10\1\132\24\10\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\14\0\4\10\1\0"+
    "\1\10\1\0\5\10\1\133\31\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\14\0\4\10\1\0\1\10\1\0"+
    "\11\10\1\125\25\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\14\0\4\10\1\0\1\134\1\0\13\10\1\135"+
    "\12\10\1\136\10\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\14\0\4\10\1\0\1\10\1\0\5\10\1\137"+
    "\5\10\1\132\23\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\14\0\4\10\1\0\1\10\1\0\27\10\1\140"+
    "\7\10\14\0\2\10\4\0\2\10\1\0\4\10\14\0"+
    "\4\10\1\0\1\10\1\0\32\10\1\141\4\10\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\14\0\4\10\1\0"+
    "\1\10\1\0\22\10\1\142\14\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\14\0\4\10\1\0\1\10\1\0"+
    "\25\10\1\142\11\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\14\0\4\10\1\0\1\10\1\0\1\10\1\143"+
    "\13\10\1\144\4\10\1\145\14\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\14\0\4\10\1\0\1\10\1\0"+
    "\14\10\1\146\7\10\1\147\12\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\14\0\4\10\1\0\1\10\1\0"+
    "\5\10\1\150\12\10\1\151\4\10\1\152\11\10\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\14\0\4\10\1\0"+
    "\1\147\1\0\17\10\1\146\17\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\14\0\4\10\1\0\1\10\1\0"+
    "\24\10\1\153\12\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\14\0\4\10\1\0\1\10\1\0\37\10\14\0"+
    "\1\123\1\10\4\0\2\10\1\0\4\10\14\0\4\10"+
    "\1\0\1\154\1\0\37\10\14\0\2\10\4\0\2\10"+
    "\1\0\4\10\14\0\4\10\1\0\1\10\1\0\2\10"+
    "\1\155\34\10\14\0\2\10\4\0\2\10\1\0\4\10"+
    "\14\0\4\10\1\0\1\10\1\0\14\10\1\156\7\10"+
    "\1\157\12\10\14\0\2\10\4\0\2\10\1\0\4\10"+
    "\14\0\4\10\1\0\1\10\1\0\6\10\1\160\30\10"+
    "\14\0\2\10\4\0\2\10\1\0\4\10\14\0\4\10"+
    "\1\0\1\157\1\0\17\10\1\156\17\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\70\0\1\161\112\0\1\162"+
    "\1\0\1\163\113\0\1\164\113\0\1\165\106\0\1\166"+
    "\112\0\1\167\36\0\4\10\1\0\1\10\1\0\1\10"+
    "\1\170\10\10\1\171\24\10\14\0\2\10\4\0\2\10"+
    "\1\0\4\10\14\0\4\10\1\0\1\10\1\0\5\10"+
    "\1\172\5\10\1\173\23\10\14\0\2\10\4\0\2\10"+
    "\1\0\4\10\14\0\4\10\1\0\1\10\1\0\30\10"+
    "\1\174\6\10\14\0\2\10\4\0\2\10\1\0\4\10"+
    "\14\0\4\10\1\0\1\10\1\0\33\10\1\175\3\10"+
    "\14\0\2\10\4\0\2\10\1\0\4\10\10\0\1\101"+
    "\2\0\105\101\1\0\1\101\22\0\1\176\10\0\1\177"+
    "\5\0\1\200\47\0\1\201\2\0\1\106\2\0\106\106"+
    "\1\0\1\106\2\0\1\110\112\0\1\114\114\0\4\115"+
    "\1\0\1\115\1\0\37\115\14\0\2\115\4\0\2\115"+
    "\1\0\4\115\16\0\2\117\111\0\1\116\1\117\111\0"+
    "\1\202\1\203\1\204\51\0\1\204\36\0\1\205\1\206"+
    "\1\0\1\121\25\0\1\121\57\0\4\10\1\0\1\10"+
    "\1\0\2\10\1\207\34\10\14\0\2\10\4\0\2\10"+
    "\1\0\4\10\14\0\4\10\1\0\1\10\1\0\14\10"+
    "\1\210\22\10\14\0\2\10\4\0\2\10\1\0\4\10"+
    "\14\0\4\10\1\0\1\10\1\0\30\10\1\211\6\10"+
    "\14\0\2\10\4\0\2\10\1\0\4\10\14\0\4\10"+
    "\1\0\1\10\1\0\35\10\1\212\1\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\14\0\4\10\1\0\1\10"+
    "\1\0\37\10\14\0\2\10\4\0\2\10\1\0\1\213"+
    "\3\10\14\0\4\10\1\0\1\10\1\0\6\10\1\214"+
    "\30\10\14\0\2\10\4\0\2\10\1\0\4\10\14\0"+
    "\4\10\1\0\1\10\1\0\36\10\1\212\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\14\0\4\10\1\0\1\10"+
    "\1\0\17\10\1\215\17\10\14\0\2\10\4\0\2\10"+
    "\1\0\4\10\14\0\4\10\1\0\1\10\1\0\33\10"+
    "\1\216\3\10\14\0\2\10\4\0\2\10\1\0\4\10"+
    "\14\0\4\10\1\0\1\10\1\0\37\10\14\0\2\10"+
    "\4\0\2\10\1\0\1\10\1\217\2\10\14\0\4\10"+
    "\1\0\1\10\1\0\30\10\1\220\6\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\14\0\4\10\1\0\1\10"+
    "\1\0\33\10\1\221\3\10\14\0\2\10\4\0\2\10"+
    "\1\0\4\10\14\0\4\10\1\0\1\10\1\0\37\10"+
    "\14\0\2\10\4\0\1\222\1\10\1\0\4\10\14\0"+
    "\4\10\1\0\1\10\1\0\22\10\1\223\14\10\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\14\0\4\10\1\0"+
    "\1\10\1\0\23\10\1\224\13\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\14\0\4\10\1\0\1\10\1\0"+
    "\37\10\14\0\2\10\4\0\1\10\1\225\1\0\4\10"+
    "\14\0\4\10\1\0\1\10\1\0\25\10\1\226\11\10"+
    "\14\0\2\10\4\0\2\10\1\0\4\10\14\0\4\10"+
    "\1\0\1\10\1\0\26\10\1\227\10\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\14\0\4\10\1\0\1\10"+
    "\1\0\14\10\1\230\22\10\14\0\2\10\4\0\2\10"+
    "\1\0\4\10\14\0\4\10\1\0\1\10\1\0\17\10"+
    "\1\231\17\10\14\0\2\10\4\0\2\10\1\0\4\10"+
    "\14\0\4\10\1\0\1\10\1\0\3\10\1\232\33\10"+
    "\14\0\2\10\4\0\2\10\1\0\4\10\14\0\4\10"+
    "\1\0\1\10\1\0\7\10\1\232\27\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\72\0\1\233\34\0\4\10"+
    "\1\0\1\10\1\0\2\10\1\234\34\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\14\0\4\10\1\0\1\10"+
    "\1\0\3\10\1\235\33\10\14\0\2\10\4\0\2\10"+
    "\1\0\4\10\14\0\4\10\1\0\1\10\1\0\6\10"+
    "\1\236\30\10\14\0\2\10\4\0\2\10\1\0\4\10"+
    "\14\0\4\10\1\0\1\10\1\0\7\10\1\235\27\10"+
    "\14\0\2\10\4\0\2\10\1\0\4\10\14\0\4\10"+
    "\1\0\1\10\1\0\23\10\1\237\13\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\14\0\4\10\1\0\1\10"+
    "\1\0\26\10\1\240\10\10\14\0\2\10\4\0\2\10"+
    "\1\0\4\10\16\0\2\203\111\0\1\202\1\203\114\0"+
    "\1\121\25\0\1\121\61\0\2\206\1\0\1\121\25\0"+
    "\1\121\57\0\4\10\1\0\1\10\1\0\3\10\1\241"+
    "\33\10\14\0\2\10\4\0\2\10\1\0\4\10\14\0"+
    "\4\10\1\0\1\10\1\0\15\10\1\242\21\10\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\14\0\4\10\1\0"+
    "\1\10\1\0\30\10\1\243\6\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\14\0\4\10\1\0\1\10\1\0"+
    "\1\10\1\244\35\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\14\0\4\10\1\0\1\10\1\0\7\10\1\241"+
    "\27\10\14\0\2\10\4\0\2\10\1\0\4\10\14\0"+
    "\4\10\1\0\1\10\1\0\20\10\1\245\16\10\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\14\0\4\10\1\0"+
    "\1\10\1\0\33\10\1\243\3\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\14\0\4\10\1\0\1\10\1\0"+
    "\5\10\1\246\31\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\14\0\4\10\1\0\1\10\1\0\31\10\1\247"+
    "\5\10\14\0\2\10\4\0\2\10\1\0\4\10\14\0"+
    "\4\10\1\0\1\10\1\0\34\10\1\250\2\10\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\14\0\4\10\1\0"+
    "\1\10\1\0\24\10\1\251\12\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\14\0\4\10\1\0\1\10\1\0"+
    "\12\10\1\252\24\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\14\0\4\10\1\0\1\10\1\0\24\10\1\253"+
    "\12\10\14\0\2\10\4\0\2\10\1\0\4\10\14\0"+
    "\4\10\1\0\1\254\1\0\37\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\14\0\4\10\1\0\1\10\1\0"+
    "\13\10\1\255\23\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\14\0\4\10\1\0\1\253\1\0\37\10\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\14\0\4\10\1\0"+
    "\1\10\1\0\23\10\1\256\13\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\14\0\4\10\1\0\1\10\1\0"+
    "\26\10\1\257\10\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\14\0\4\10\1\0\1\10\1\0\23\10\1\260"+
    "\13\10\14\0\2\10\4\0\2\10\1\0\4\10\14\0"+
    "\4\10\1\0\1\10\1\0\26\10\1\261\10\10\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\14\0\4\10\1\0"+
    "\1\10\1\0\31\10\1\262\5\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\14\0\4\10\1\0\1\10\1\0"+
    "\34\10\1\262\2\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\14\0\4\10\1\0\1\10\1\0\1\10\1\263"+
    "\35\10\14\0\2\10\4\0\2\10\1\0\4\10\14\0"+
    "\4\10\1\0\1\10\1\0\3\10\1\264\33\10\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\14\0\4\10\1\0"+
    "\1\10\1\0\5\10\1\265\31\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\14\0\4\10\1\0\1\10\1\0"+
    "\7\10\1\266\27\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\14\0\4\10\1\0\1\10\1\0\24\10\1\267"+
    "\12\10\14\0\2\10\4\0\2\10\1\0\4\10\14\0"+
    "\4\10\1\0\1\267\1\0\37\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\14\0\4\10\1\0\1\10\1\0"+
    "\31\10\1\270\5\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\14\0\4\10\1\0\1\10\1\0\35\10\1\271"+
    "\1\10\14\0\2\10\4\0\2\10\1\0\4\10\14\0"+
    "\4\10\1\0\1\10\1\0\34\10\1\270\2\10\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\14\0\4\10\1\0"+
    "\1\10\1\0\36\10\1\271\14\0\2\10\4\0\2\10"+
    "\1\0\4\10\14\0\4\10\1\0\1\10\1\0\22\10"+
    "\1\272\14\10\14\0\2\10\4\0\2\10\1\0\4\10"+
    "\14\0\4\10\1\0\1\10\1\0\25\10\1\273\11\10"+
    "\14\0\2\10\4\0\2\10\1\0\4\10\14\0\4\10"+
    "\1\0\1\10\1\0\31\10\1\274\5\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\14\0\4\10\1\0\1\10"+
    "\1\0\34\10\1\274\2\10\14\0\2\10\4\0\2\10"+
    "\1\0\4\10\14\0\4\10\1\0\1\10\1\0\2\10"+
    "\1\275\34\10\14\0\2\10\4\0\2\10\1\0\4\10"+
    "\14\0\4\10\1\0\1\10\1\0\24\10\1\276\12\10"+
    "\14\0\2\10\4\0\2\10\1\0\4\10\14\0\4\10"+
    "\1\0\1\10\1\0\6\10\1\277\30\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\14\0\4\10\1\0\1\276"+
    "\1\0\37\10\14\0\2\10\4\0\2\10\1\0\4\10"+
    "\14\0\4\10\1\0\1\10\1\0\2\10\1\300\34\10"+
    "\14\0\2\10\4\0\2\10\1\0\4\10\14\0\4\10"+
    "\1\0\1\10\1\0\6\10\1\300\30\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\14\0\4\10\1\0\1\10"+
    "\1\0\16\10\1\301\20\10\14\0\2\10\4\0\2\10"+
    "\1\0\4\10\14\0\4\10\1\0\1\10\1\0\21\10"+
    "\1\301\15\10\14\0\2\10\4\0\2\10\1\0\4\10"+
    "\10\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9900];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\1\11\1\1\1\11\6\1\1\11\27\1\6\11"+
    "\7\1\3\11\2\1\1\11\2\1\6\11\1\1\3\11"+
    "\3\1\3\11\1\1\1\11\1\1\1\11\1\1\2\0"+
    "\37\1\2\11\1\0\4\11\6\1\5\11\1\1\1\0"+
    "\26\1\1\11\46\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[193];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  StringBuffer string = new StringBuffer();

  private int startLine = 0;

  private String file = "";

  public void setStartLine(int startLine)
  {
    this.startLine = startLine;
  }

  public void setFile(String file)
  {
    this.file = file;
  }

  private Symbol symbol(int type) {
    return new PrintableSymbol(type, file, yyline + startLine, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new PrintableSymbol(type, file, yyline + startLine, yycolumn, value);
  }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public ECATokenLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public ECATokenLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 178) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 2: 
          { /* ignore */
          }
        case 61: break;
        case 17: 
          { return symbol(sym.BAND);
          }
        case 62: break;
        case 1: 
          { throw new Error("Illegal character <"+ yytext()+">");
          }
        case 63: break;
        case 8: 
          { return symbol(sym.RPAREN);
          }
        case 64: break;
        case 33: 
          { yybegin(YYINITIAL);
			  return symbol(sym.STRING_LITERAL,
					string.toString());
          }
        case 65: break;
        case 56: 
          { return symbol(sym.BOOLEAN_LITERAL, Boolean.TRUE);
          }
        case 66: break;
        case 19: 
          { return symbol(sym.GT);
          }
        case 67: break;
        case 50: 
          { string.append('\t');
          }
        case 68: break;
        case 9: 
          { return symbol(sym.LSQUARE);
          }
        case 69: break;
        case 14: 
          { return symbol(sym.LT);
          }
        case 70: break;
        case 28: 
          { string.setLength(0); yybegin(STRING);
          }
        case 71: break;
        case 40: 
          { return symbol(sym.FLOAT_LITERAL, Float.valueOf(yytext()));
          }
        case 72: break;
        case 58: 
          { return symbol(sym.THROW);
          }
        case 73: break;
        case 48: 
          { return symbol(sym.AND);
          }
        case 74: break;
        case 18: 
          { return symbol(sym.NOT);
          }
        case 75: break;
        case 13: 
          { return symbol(sym.ASSIGN);
          }
        case 76: break;
        case 23: 
          { return symbol(sym.DIV);
          }
        case 77: break;
        case 34: 
          { string.append('\\');
          }
        case 78: break;
        case 59: 
          { return symbol(sym.RETURN);
          }
        case 79: break;
        case 55: 
          { return symbol(sym.NULL_LITERAL);
          }
        case 80: break;
        case 51: 
          { string.append('\r');
          }
        case 81: break;
        case 38: 
          { yybegin(YYINITIAL);
          }
        case 82: break;
        case 5: 
          { return symbol(sym.PLUS);
          }
        case 83: break;
        case 24: 
          { return symbol(sym.MOD);
          }
        case 84: break;
        case 27: 
          { yybegin(COMMENT);
          }
        case 85: break;
        case 3: 
          { return symbol(sym.IDENTIFIER, yytext());
          }
        case 86: break;
        case 44: 
          { return symbol(sym.DO);
          }
        case 87: break;
        case 52: 
          { string.append('\"');
          }
        case 88: break;
        case 26: 
          { return symbol(sym.COLON);
          }
        case 89: break;
        case 20: 
          { return symbol(sym.BXOR);
          }
        case 90: break;
        case 32: 
          { throw new Error("File " + file + " line " + (yyline + startLine) + " : newline in string");
          }
        case 91: break;
        case 42: 
          { return symbol(sym.IF);
          }
        case 92: break;
        case 57: 
          { return symbol(sym.BOOLEAN_LITERAL, Boolean.FALSE);
          }
        case 93: break;
        case 7: 
          { return symbol(sym.LPAREN);
          }
        case 94: break;
        case 45: 
          { return symbol(sym.OR);
          }
        case 95: break;
        case 41: 
          { return symbol(sym.EQ);
          }
        case 96: break;
        case 49: 
          { string.append('\n');
          }
        case 97: break;
        case 11: 
          { return symbol(sym.SEMI);
          }
        case 98: break;
        case 10: 
          { return symbol(sym.RSQUARE);
          }
        case 99: break;
        case 43: 
          { return symbol(sym.NE);
          }
        case 100: break;
        case 15: 
          { return symbol(sym.MINUS);
          }
        case 101: break;
        case 35: 
          { throw new Error("File " + file + " line " + (yyline + startLine) + " : newline in quoted identifier");
          }
        case 102: break;
        case 16: 
          { return symbol(sym.BOR);
          }
        case 103: break;
        case 29: 
          { string.setLength(0);  yybegin(QUOTEDIDENT);
          }
        case 104: break;
        case 53: 
          { return symbol(sym.NEW);
          }
        case 105: break;
        case 39: 
          { return symbol(sym.DOLLAR, yytext());
          }
        case 106: break;
        case 21: 
          { return symbol(sym.TWIDDLE);
          }
        case 107: break;
        case 31: 
          { throw new Error("File " + file + " line " + (yyline + startLine) + " : illegal character in string <"+ yytext()+">");
          }
        case 108: break;
        case 54: 
          { return symbol(sym.BIND);
          }
        case 109: break;
        case 25: 
          { return symbol(sym.TERN_IF);
          }
        case 110: break;
        case 46: 
          { return symbol(sym.GE);
          }
        case 111: break;
        case 36: 
          { yybegin(YYINITIAL);
			  return symbol(sym.IDENTIFIER,
					string.toString());
          }
        case 112: break;
        case 12: 
          { return symbol(sym.COMMA);
          }
        case 113: break;
        case 47: 
          { return symbol(sym.LE);
          }
        case 114: break;
        case 22: 
          { return symbol(sym.MUL);
          }
        case 115: break;
        case 60: 
          { return symbol(sym.NOTHING);
          }
        case 116: break;
        case 4: 
          { return symbol(sym.INTEGER_LITERAL, Integer.valueOf(yytext()));
          }
        case 117: break;
        case 30: 
          { string.append( yytext() );
          }
        case 118: break;
        case 37: 
          { /*ignore */
          }
        case 119: break;
        case 6: 
          { return symbol(sym.DOT);
          }
        case 120: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
