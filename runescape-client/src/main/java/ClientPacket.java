import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ln")
@Implements("ClientPacket")
public class ClientPacket implements class307 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3226;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static final ClientPacket field3134;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3135;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3136;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3163;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3229;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static final ClientPacket field3139;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3140;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3141;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3137;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3143;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3144;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3138;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3146;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static final ClientPacket field3227;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3176;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3149;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static final ClientPacket field3133;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3164;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3165;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3153;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3154;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3155;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3233;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3157;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3169;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3159;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3172;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3161;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3162;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3180;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3171;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3207;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3166;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3167;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3202;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3185;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3170;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3151;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3204;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3173;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3174;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3175;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3197;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3188;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static final ClientPacket field3178;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3145;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3177;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3181;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3182;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3183;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3219;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3148;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3186;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3187;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3168;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3189;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3190;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3191;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3192;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3193;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3194;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3160;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3196;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3206;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3218;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3199;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3200;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3201;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3184;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3203;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3142;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3205;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3215;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3152;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3208;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3209;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3210;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3211;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3212;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3213;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3214;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3198;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3216;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3217;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3195;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3147;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3158;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3221;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3222;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3223;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3224;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3225;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3156;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3150;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3228;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3220;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final ClientPacket field3230;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -1749751835
	)
	@Export("id")
	final int id;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 1792610735
	)
	@Export("length")
	final int length;

	static {
		field3226 = new ClientPacket(0, 0); // L: 5
		field3134 = new ClientPacket(1, 7); // L: 6
		field3135 = new ClientPacket(2, -1); // L: 7
		field3136 = new ClientPacket(3, 1); // L: 8
		field3163 = new ClientPacket(4, 6); // L: 9
		field3229 = new ClientPacket(5, 11); // L: 10
		field3139 = new ClientPacket(6, -1); // L: 11
		field3140 = new ClientPacket(7, 13); // L: 12
		field3141 = new ClientPacket(8, -1); // L: 13
		field3137 = new ClientPacket(9, 22); // L: 14
		field3143 = new ClientPacket(10, 10); // L: 15
		field3144 = new ClientPacket(11, 3); // L: 16
		field3138 = new ClientPacket(12, -1); // L: 17
		field3146 = new ClientPacket(13, -1); // L: 18
		field3227 = new ClientPacket(14, -1); // L: 19
		field3176 = new ClientPacket(15, 4); // L: 20
		field3149 = new ClientPacket(16, 2); // L: 21
		field3133 = new ClientPacket(17, 2); // L: 22
		field3164 = new ClientPacket(18, 2); // L: 23
		field3165 = new ClientPacket(19, 8); // L: 24
		field3153 = new ClientPacket(20, 15); // L: 25
		field3154 = new ClientPacket(21, 9); // L: 26
		field3155 = new ClientPacket(22, 4); // L: 27
		field3233 = new ClientPacket(23, -1); // L: 28
		field3157 = new ClientPacket(24, 7); // L: 29
		field3169 = new ClientPacket(25, 16); // L: 30
		field3159 = new ClientPacket(26, 3); // L: 31
		field3172 = new ClientPacket(27, 8); // L: 32
		field3161 = new ClientPacket(28, 8); // L: 33
		field3162 = new ClientPacket(29, 7); // L: 34
		field3180 = new ClientPacket(30, 0); // L: 35
		field3171 = new ClientPacket(31, 3); // L: 36
		field3207 = new ClientPacket(32, 6); // L: 37
		field3166 = new ClientPacket(33, 7); // L: 38
		field3167 = new ClientPacket(34, 4); // L: 39
		field3202 = new ClientPacket(35, 3); // L: 40
		field3185 = new ClientPacket(36, 2); // L: 41
		field3170 = new ClientPacket(37, 1); // L: 42
		field3151 = new ClientPacket(38, 7); // L: 43
		field3204 = new ClientPacket(39, 7); // L: 44
		field3173 = new ClientPacket(40, 11); // L: 45
		field3174 = new ClientPacket(41, 0); // L: 46
		field3175 = new ClientPacket(42, 1); // L: 47
		field3197 = new ClientPacket(43, -1); // L: 48
		field3188 = new ClientPacket(44, -1); // L: 49
		field3178 = new ClientPacket(45, 2); // L: 50
		field3145 = new ClientPacket(46, 11); // L: 51
		field3177 = new ClientPacket(47, 3); // L: 52
		field3181 = new ClientPacket(48, 5); // L: 53
		field3182 = new ClientPacket(49, 3); // L: 54
		field3183 = new ClientPacket(50, 8); // L: 55
		field3219 = new ClientPacket(51, 8); // L: 56
		field3148 = new ClientPacket(52, -1); // L: 57
		field3186 = new ClientPacket(53, 3); // L: 58
		field3187 = new ClientPacket(54, -1); // L: 59
		field3168 = new ClientPacket(55, 0); // L: 60
		field3189 = new ClientPacket(56, 4); // L: 61
		field3190 = new ClientPacket(57, -1); // L: 62
		field3191 = new ClientPacket(58, -1); // L: 63
		field3192 = new ClientPacket(59, -2); // L: 64
		field3193 = new ClientPacket(60, 8); // L: 65
		field3194 = new ClientPacket(61, -2); // L: 66
		field3160 = new ClientPacket(62, 11); // L: 67
		field3196 = new ClientPacket(63, -1); // L: 68
		field3206 = new ClientPacket(64, 7); // L: 69
		field3218 = new ClientPacket(65, 3); // L: 70
		field3199 = new ClientPacket(66, 3); // L: 71
		field3200 = new ClientPacket(67, 2); // L: 72
		field3201 = new ClientPacket(68, -1); // L: 73
		field3184 = new ClientPacket(69, 7); // L: 74
		field3203 = new ClientPacket(70, 3); // L: 75
		field3142 = new ClientPacket(71, 3); // L: 76
		field3205 = new ClientPacket(72, 3); // L: 77
		field3215 = new ClientPacket(73, 6); // L: 78
		field3152 = new ClientPacket(74, -2); // L: 79
		field3208 = new ClientPacket(75, 8); // L: 80
		field3209 = new ClientPacket(76, -1); // L: 81
		field3210 = new ClientPacket(77, 3); // L: 82
		field3211 = new ClientPacket(78, -1); // L: 83
		field3212 = new ClientPacket(79, 7); // L: 84
		field3213 = new ClientPacket(80, 4); // L: 85
		field3214 = new ClientPacket(81, -1); // L: 86
		field3198 = new ClientPacket(82, 8); // L: 87
		field3216 = new ClientPacket(83, 0); // L: 88
		field3217 = new ClientPacket(84, 8); // L: 89
		field3195 = new ClientPacket(85, 3); // L: 90
		field3147 = new ClientPacket(86, 7); // L: 91
		field3158 = new ClientPacket(87, 8); // L: 92
		field3221 = new ClientPacket(88, -1); // L: 93
		field3222 = new ClientPacket(89, 7); // L: 94
		field3223 = new ClientPacket(90, 15); // L: 95
		field3224 = new ClientPacket(91, -1); // L: 96
		field3225 = new ClientPacket(92, 15); // L: 97
		field3156 = new ClientPacket(93, -1); // L: 98
		field3150 = new ClientPacket(94, 4); // L: 99
		field3228 = new ClientPacket(95, 15); // L: 100
		field3220 = new ClientPacket(96, 16); // L: 101
		field3230 = new ClientPacket(97, -1); // L: 102
	}

	ClientPacket(int var1, int var2) {
		this.id = var1; // L: 107
		this.length = var2; // L: 108
	} // L: 109

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "1044263127"
	)
	static int method5865(int var0, Script var1, boolean var2) {
		Widget var3 = class33.field184.method6240(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1872
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1873
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = KitDefinition.Widget_unpackTargetMask(MouseRecorder.getWidgetFlags(var3)); // L: 1874
			return 1; // L: 1875
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1877
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1884
				if (var3.dataText == null) { // L: 1885
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1886
				}

				return 1; // L: 1887
			} else {
				return 2; // L: 1889
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1878
			--var4; // L: 1879
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1880
				Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1881
			} else {
				Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1882
		}
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "([Lnm;IB)V",
		garbageValue = "5"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11989
			Widget var3 = var0[var2]; // L: 11990
			if (var3 != null) { // L: 11991
				if (var3.type == 0) { // L: 11992
					if (var3.children != null) { // L: 11993
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11994
					if (var4 != null) { // L: 11995
						Interpreter.method2071(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 11997
					var5 = new ScriptEvent(); // L: 11998
					var5.widget = var3; // L: 11999
					var5.args = var3.onDialogAbort; // L: 12000
					Interpreter.runScriptEvent(var5); // L: 12001
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 12003
					if (var3.childIndex >= 0) { // L: 12004
						Widget var6 = class33.field184.method6240(var3.id); // L: 12005
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 12006
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 12010
					var5.widget = var3; // L: 12011
					var5.args = var3.onSubChange; // L: 12012
					Interpreter.runScriptEvent(var5); // L: 12013
				}
			}
		}

	} // L: 12016
}
