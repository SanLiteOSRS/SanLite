import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("ClientPacket")
public class ClientPacket implements class190 {
	@ObfuscatedName("ph")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2238;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2237;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2313;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2234;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2329;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2236;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	static final ClientPacket field2307;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2288;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2239;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2330;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2324;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2242;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2243;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2244;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2245;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2246;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2247;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2248;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2249;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2250;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2251;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2252;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2284;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2254;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2274;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2256;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2257;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2258;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2335;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2260;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2261;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2262;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2263;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2264;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2265;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2290;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2267;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2268;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2269;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2270;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2271;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2272;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2298;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2282;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2275;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	static final ClientPacket field2295;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2277;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2240;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2279;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2280;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2281;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2315;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	static final ClientPacket field2283;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2255;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2285;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2286;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2325;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2331;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2289;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2334;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2291;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2292;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2293;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2294;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2253;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2296;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2297;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2276;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2312;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2300;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2301;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	static final ClientPacket field2302;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2303;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2304;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2306;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2241;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2318;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2308;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2309;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2310;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2311;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2323;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2322;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2314;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2299;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2316;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2317;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2266;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2319;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2320;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2321;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2233;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	static final ClientPacket field2231;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2305;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2287;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2326;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2327;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2328;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2259;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2332;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2235;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2232;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	public static final ClientPacket field2333;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1312212621
	)
	@Export("id")
	final int id;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 848809965
	)
	@Export("length")
	final int length;

	static {
		field2238 = new ClientPacket(0, 16);
		field2237 = new ClientPacket(1, -1);
		field2313 = new ClientPacket(2, 8);
		field2234 = new ClientPacket(3, -1);
		field2329 = new ClientPacket(4, -1);
		field2236 = new ClientPacket(5, 14);
		field2307 = new ClientPacket(6, -1);
		field2288 = new ClientPacket(7, 7);
		field2239 = new ClientPacket(8, 3);
		field2330 = new ClientPacket(9, 4);
		field2324 = new ClientPacket(10, 3);
		field2242 = new ClientPacket(11, 8);
		field2243 = new ClientPacket(12, 8);
		field2244 = new ClientPacket(13, 3);
		field2245 = new ClientPacket(14, 3);
		field2246 = new ClientPacket(15, 7);
		field2247 = new ClientPacket(16, 0);
		field2248 = new ClientPacket(17, 8);
		field2249 = new ClientPacket(18, 7);
		field2250 = new ClientPacket(19, 8);
		field2251 = new ClientPacket(20, 8);
		field2252 = new ClientPacket(21, 8);
		field2284 = new ClientPacket(22, 2);
		field2254 = new ClientPacket(23, 3);
		field2274 = new ClientPacket(24, 8);
		field2256 = new ClientPacket(25, 8);
		field2257 = new ClientPacket(26, 7);
		field2258 = new ClientPacket(27, 7);
		field2335 = new ClientPacket(28, 13);
		field2260 = new ClientPacket(29, -1);
		field2261 = new ClientPacket(30, 13);
		field2262 = new ClientPacket(31, 0);
		field2263 = new ClientPacket(32, 8);
		field2264 = new ClientPacket(33, 3);
		field2265 = new ClientPacket(34, 7);
		field2290 = new ClientPacket(35, 3);
		field2267 = new ClientPacket(36, 9);
		field2268 = new ClientPacket(37, 4);
		field2269 = new ClientPacket(38, -1);
		field2270 = new ClientPacket(39, -1);
		field2271 = new ClientPacket(40, 0);
		field2272 = new ClientPacket(41, 5);
		field2298 = new ClientPacket(42, 8);
		field2282 = new ClientPacket(43, 13);
		field2275 = new ClientPacket(44, 9);
		field2295 = new ClientPacket(45, 7);
		field2277 = new ClientPacket(46, 8);
		field2240 = new ClientPacket(47, -1);
		field2279 = new ClientPacket(48, -1);
		field2280 = new ClientPacket(49, 3);
		field2281 = new ClientPacket(50, 3);
		field2315 = new ClientPacket(51, 16);
		field2283 = new ClientPacket(52, -1);
		field2255 = new ClientPacket(53, -2);
		field2285 = new ClientPacket(54, 8);
		field2286 = new ClientPacket(55, 4);
		field2325 = new ClientPacket(56, 3);
		field2331 = new ClientPacket(57, -1);
		field2289 = new ClientPacket(58, 8);
		field2334 = new ClientPacket(59, -1);
		field2291 = new ClientPacket(60, 8);
		field2292 = new ClientPacket(61, 4);
		field2293 = new ClientPacket(62, 15);
		field2294 = new ClientPacket(63, 8);
		field2253 = new ClientPacket(64, 6);
		field2296 = new ClientPacket(65, 10);
		field2297 = new ClientPacket(66, 8);
		field2276 = new ClientPacket(67, 8);
		field2312 = new ClientPacket(68, 1);
		field2300 = new ClientPacket(69, 8);
		field2301 = new ClientPacket(70, 7);
		field2302 = new ClientPacket(71, -1);
		field2303 = new ClientPacket(72, -1);
		field2304 = new ClientPacket(73, 9);
		field2306 = new ClientPacket(74, 7);
		field2241 = new ClientPacket(75, -1);
		field2318 = new ClientPacket(76, -1);
		field2308 = new ClientPacket(77, 3);
		field2309 = new ClientPacket(78, 9);
		field2310 = new ClientPacket(79, -2);
		field2311 = new ClientPacket(80, 3);
		field2323 = new ClientPacket(81, 3);
		field2322 = new ClientPacket(82, 6);
		field2314 = new ClientPacket(83, -1);
		field2299 = new ClientPacket(84, 15);
		field2316 = new ClientPacket(85, 2);
		field2317 = new ClientPacket(86, 2);
		field2266 = new ClientPacket(87, 8);
		field2319 = new ClientPacket(88, 0);
		field2320 = new ClientPacket(89, 0);
		field2321 = new ClientPacket(90, 4);
		field2233 = new ClientPacket(91, 2);
		field2231 = new ClientPacket(92, 2);
		field2305 = new ClientPacket(93, 7);
		field2287 = new ClientPacket(94, -1);
		field2326 = new ClientPacket(95, -2);
		field2327 = new ClientPacket(96, -1);
		field2328 = new ClientPacket(97, 11);
		field2259 = new ClientPacket(98, 7);
		field2332 = new ClientPacket(99, 11);
		field2235 = new ClientPacket(100, 3);
		field2232 = new ClientPacket(101, 16);
		field2333 = new ClientPacket(102, -1);
	}

	ClientPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IS)Ljo;",
		garbageValue = "29667"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructDefinition StructDefinition_getStructDefinition(int var0) {
		StructDefinition var1 = (StructDefinition)StructDefinition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructDefinition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructDefinition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "711631648"
	)
	static void method3745() {
		try {
			File var0 = new File(class52.userHomeDirectory, "random.dat");
			int var2;
			if (var0.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			} else {
				label38:
				for (int var1 = 0; var1 < Client.field957.length; ++var1) {
					for (var2 = 0; var2 < GrandExchangeEvents.field68.length; ++var2) {
						File var3 = new File(GrandExchangeEvents.field68[var2] + Client.field957[var1] + File.separatorChar + "random.dat");
						if (var3.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0);
							break label38;
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) {
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				var2 = var4.read();
				var4.seek(0L);
				var4.write(var2);
				var4.seek(0L);
				var4.close();
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "([BI)Lco;",
		garbageValue = "-1523199610"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script();
		Buffer var2 = new Buffer(var0);
		var2.offset = var2.array.length - 2;
		int var3 = var2.readUnsignedShort();
		int var4 = var2.array.length - 2 - var3 - 12;
		var2.offset = var4;
		int var5 = var2.readInt();
		var1.localIntCount = var2.readUnsignedShort();
		var1.localStringCount = var2.readUnsignedShort();
		var1.intArgumentCount = var2.readUnsignedShort();
		var1.stringArgumentCount = var2.readUnsignedShort();
		int var6 = var2.readUnsignedByte();
		int var7;
		int var8;
		if (var6 > 0) {
			var1.switches = var1.newIterableNodeHashTable(var6);

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var2.readUnsignedShort();
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? WorldMapData_0.method266(var8) : 1);
				var1.switches[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.readInt();
					int var11 = var2.readInt();
					var9.put(new IntegerNode(var11), (long)var10);
				}
			}
		}

		var2.offset = 0;
		var2.readStringCp1252NullTerminatedOrNull();
		var1.opcodes = new int[var5];
		var1.intOperands = new int[var5];
		var1.stringOperands = new String[var5];

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) {
			var8 = var2.readUnsignedShort();
			if (var8 == 3) {
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt();
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte();
			}
		}

		return var1;
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1900705803"
	)
	static final void method3744() {
		Client.field875 = Client.cycleCntr;
		ClanChat_inClanChat = true;
	}
}
