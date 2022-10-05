import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("jl")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3134;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3174;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3073;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3074;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3145;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3076;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3077;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3125;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3120;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3080;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3081;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3141;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3083;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3084;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3085;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3086;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3087;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3071;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3142;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3090;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3095;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3092;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3093;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3079;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3104;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3149;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3097;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3098;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3099;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3147;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3101;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3102;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3103;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3165;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3105;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3106;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3107;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3153;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3109;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3110;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3113;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3175;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3115;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3114;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3078;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3116;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3117;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3118;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3119;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3127;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3121;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3151;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3123;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3124;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3072;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3126;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3096;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3100;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3129;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3130;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3131;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3132;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3133;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3091;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3135;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3136;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3137;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3138;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3139;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3140;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3170;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3172;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3143;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3144;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3094;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3146;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3158;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3112;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3177;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3111;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3150;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3152;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3089;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3160;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3155;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3156;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3157;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3164;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3159;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3082;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3161;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3088;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3163;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3075;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3154;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3162;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3167;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3168;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3169;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3122;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3171;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3128;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3173;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3108;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3166;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	public static final ServerPacket field3176;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 418700999
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -779549889
	)
	@Export("length")
	public final int length;

	static {
		field3134 = new ServerPacket(0, 0); // L: 5
		field3174 = new ServerPacket(1, -2); // L: 6
		field3073 = new ServerPacket(2, -2); // L: 7
		field3074 = new ServerPacket(3, 2); // L: 8
		field3145 = new ServerPacket(4, 2); // L: 9
		field3076 = new ServerPacket(5, -2); // L: 10
		field3077 = new ServerPacket(6, 7); // L: 11
		field3125 = new ServerPacket(7, 1); // L: 12
		field3120 = new ServerPacket(8, 15); // L: 13
		field3080 = new ServerPacket(9, 6); // L: 14
		field3081 = new ServerPacket(10, 4); // L: 15
		field3141 = new ServerPacket(11, 4); // L: 16
		field3083 = new ServerPacket(12, 1); // L: 17
		field3084 = new ServerPacket(13, 0); // L: 18
		field3085 = new ServerPacket(14, 7); // L: 19
		field3086 = new ServerPacket(15, 6); // L: 20
		field3087 = new ServerPacket(16, 2); // L: 21
		field3071 = new ServerPacket(17, 8); // L: 22
		field3142 = new ServerPacket(18, 2); // L: 23
		field3090 = new ServerPacket(19, 14); // L: 24
		field3095 = new ServerPacket(20, 4); // L: 25
		field3092 = new ServerPacket(21, 1); // L: 26
		field3093 = new ServerPacket(22, -2); // L: 27
		field3079 = new ServerPacket(23, -1); // L: 28
		field3104 = new ServerPacket(24, -2); // L: 29
		field3149 = new ServerPacket(25, -2); // L: 30
		field3097 = new ServerPacket(26, 4); // L: 31
		field3098 = new ServerPacket(27, 0); // L: 32
		field3099 = new ServerPacket(28, 1); // L: 33
		field3147 = new ServerPacket(29, 8); // L: 34
		field3101 = new ServerPacket(30, 4); // L: 35
		field3102 = new ServerPacket(31, 8); // L: 36
		field3103 = new ServerPacket(32, 6); // L: 37
		field3165 = new ServerPacket(33, -2); // L: 38
		field3105 = new ServerPacket(34, 1); // L: 39
		field3106 = new ServerPacket(35, 8); // L: 40
		field3107 = new ServerPacket(36, 10); // L: 41
		field3153 = new ServerPacket(37, 0); // L: 42
		field3109 = new ServerPacket(38, 6); // L: 43
		field3110 = new ServerPacket(39, 4); // L: 44
		field3113 = new ServerPacket(40, 12); // L: 45
		field3175 = new ServerPacket(41, 2); // L: 46
		field3115 = new ServerPacket(42, -2); // L: 47
		field3114 = new ServerPacket(43, -2); // L: 48
		field3078 = new ServerPacket(44, 6); // L: 49
		field3116 = new ServerPacket(45, 6); // L: 50
		field3117 = new ServerPacket(46, -2); // L: 51
		field3118 = new ServerPacket(47, -2); // L: 52
		field3119 = new ServerPacket(48, 6); // L: 53
		field3127 = new ServerPacket(49, 4); // L: 54
		field3121 = new ServerPacket(50, -1); // L: 55
		field3151 = new ServerPacket(51, -2); // L: 56
		field3123 = new ServerPacket(52, -1); // L: 57
		field3124 = new ServerPacket(53, 2); // L: 58
		field3072 = new ServerPacket(54, -2); // L: 59
		field3126 = new ServerPacket(55, 5); // L: 60
		field3096 = new ServerPacket(56, -1); // L: 61
		field3100 = new ServerPacket(57, 28); // L: 62
		field3129 = new ServerPacket(58, 20); // L: 63
		field3130 = new ServerPacket(59, -2); // L: 64
		field3131 = new ServerPacket(60, -1); // L: 65
		field3132 = new ServerPacket(61, -1); // L: 66
		field3133 = new ServerPacket(62, 0); // L: 67
		field3091 = new ServerPacket(63, -1); // L: 68
		field3135 = new ServerPacket(64, 8); // L: 69
		field3136 = new ServerPacket(65, -2); // L: 70
		field3137 = new ServerPacket(66, 8); // L: 71
		field3138 = new ServerPacket(67, 5); // L: 72
		field3139 = new ServerPacket(68, -1); // L: 73
		field3140 = new ServerPacket(69, 4); // L: 74
		field3170 = new ServerPacket(70, -2); // L: 75
		field3172 = new ServerPacket(71, 8); // L: 76
		field3143 = new ServerPacket(72, -2); // L: 77
		field3144 = new ServerPacket(73, 5); // L: 78
		field3094 = new ServerPacket(74, 6); // L: 79
		field3146 = new ServerPacket(75, -2); // L: 80
		field3158 = new ServerPacket(76, -2); // L: 81
		field3112 = new ServerPacket(77, 5); // L: 82
		field3177 = new ServerPacket(78, 6); // L: 83
		field3111 = new ServerPacket(79, 2); // L: 84
		field3150 = new ServerPacket(80, 6); // L: 85
		field3152 = new ServerPacket(81, -1); // L: 86
		field3089 = new ServerPacket(82, -2); // L: 87
		field3160 = new ServerPacket(83, -2); // L: 88
		field3155 = new ServerPacket(84, 0); // L: 89
		field3156 = new ServerPacket(85, -2); // L: 90
		field3157 = new ServerPacket(86, 5); // L: 91
		field3164 = new ServerPacket(87, -2); // L: 92
		field3159 = new ServerPacket(88, 0); // L: 93
		field3082 = new ServerPacket(89, -2); // L: 94
		field3161 = new ServerPacket(90, -2); // L: 95
		field3088 = new ServerPacket(91, 2); // L: 96
		field3163 = new ServerPacket(92, 2); // L: 97
		field3075 = new ServerPacket(93, 0); // L: 98
		field3154 = new ServerPacket(94, -2); // L: 99
		field3162 = new ServerPacket(95, 2); // L: 100
		field3167 = new ServerPacket(96, 6); // L: 101
		field3168 = new ServerPacket(97, 1); // L: 102
		field3169 = new ServerPacket(98, 5); // L: 103
		field3122 = new ServerPacket(99, 3); // L: 104
		field3171 = new ServerPacket(100, 6); // L: 105
		field3128 = new ServerPacket(101, 0); // L: 106
		field3173 = new ServerPacket(102, 3); // L: 107
		field3108 = new ServerPacket(103, 10); // L: 108
		field3166 = new ServerPacket(104, 17); // L: 109
		field3176 = new ServerPacket(105, 5); // L: 110
	}

	ServerPacket(int var1, int var2) {
		this.id = var1; // L: 119
		this.length = var2; // L: 120
	} // L: 121

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqq;II)V",
		garbageValue = "714656743"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck(); // L: 129
		var2.size = var0.readUnsignedByte(); // L: 130
		var2.id = var0.readInt(); // L: 131
		var2.operations = new int[var2.size]; // L: 132
		var2.creationErrors = new int[var2.size]; // L: 133
		var2.fields = new Field[var2.size]; // L: 134
		var2.intReplaceValues = new int[var2.size]; // L: 135
		var2.methods = new Method[var2.size]; // L: 136
		var2.arguments = new byte[var2.size][][]; // L: 137

		for (int var3 = 0; var3 < var2.size; ++var3) { // L: 138
			try {
				int var4 = var0.readUnsignedByte(); // L: 140
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) { // L: 141
					if (var4 == 3 || var4 == 4) { // L: 151
						var5 = var0.readStringCp1252NullTerminated(); // L: 152
						var6 = var0.readStringCp1252NullTerminated(); // L: 153
						var7 = var0.readUnsignedByte(); // L: 154
						String[] var8 = new String[var7]; // L: 155

						for (int var9 = 0; var9 < var7; ++var9) { // L: 156
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated(); // L: 157
						byte[][] var10 = new byte[var7][]; // L: 158
						int var12;
						if (var4 == 3) { // L: 159
							for (int var11 = 0; var11 < var7; ++var11) { // L: 160
								var12 = var0.readInt(); // L: 161
								var10[var11] = new byte[var12]; // L: 162
								var0.readBytes(var10[var11], 0, var12); // L: 163
							}
						}

						var2.operations[var3] = var4; // L: 166
						Class[] var21 = new Class[var7]; // L: 167

						for (var12 = 0; var12 < var7; ++var12) { // L: 168
							var21[var12] = class21.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = class21.loadClassFromDescriptor(var20); // L: 169
						if (class21.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 170
							throw new SecurityException();
						}

						Method[] var13 = class21.loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 171
						Method[] var14 = var13; // L: 173

						for (int var15 = 0; var15 < var14.length; ++var15) { // L: 174
							Method var16 = var14[var15]; // L: 175
							if (Reflection.getMethodName(var16).equals(var6)) { // L: 177
								Class[] var17 = Reflection.getParameterTypes(var16); // L: 178
								if (var17.length == var21.length) { // L: 179
									boolean var18 = true; // L: 180

									for (int var19 = 0; var19 < var21.length; ++var19) { // L: 181
										if (var21[var19] != var17[var19]) { // L: 182
											var18 = false; // L: 183
											break; // L: 184
										}
									}

									if (var18 && var22 == var16.getReturnType()) { // L: 187
										var2.methods[var3] = var16; // L: 188
									}
								}
							}
						}

						var2.arguments[var3] = var10; // L: 195
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated(); // L: 142
					var6 = var0.readStringCp1252NullTerminated(); // L: 143
					var7 = 0; // L: 144
					if (var4 == 1) { // L: 145
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4; // L: 146
					var2.intReplaceValues[var3] = var7; // L: 147
					if (class21.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 148
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(class21.loadClassFromDescriptor(var5), var6); // L: 149
				}
			} catch (ClassNotFoundException var24) { // L: 198
				var2.creationErrors[var3] = -1; // L: 199
			} catch (SecurityException var25) { // L: 201
				var2.creationErrors[var3] = -2; // L: 202
			} catch (NullPointerException var26) { // L: 204
				var2.creationErrors[var3] = -3; // L: 205
			} catch (Exception var27) { // L: 207
				var2.creationErrors[var3] = -4; // L: 208
			} catch (Throwable var28) { // L: 210
				var2.creationErrors[var3] = -5; // L: 211
			}
		}

		class33.reflectionChecks.addFirst(var2); // L: 214
	} // L: 215
}
