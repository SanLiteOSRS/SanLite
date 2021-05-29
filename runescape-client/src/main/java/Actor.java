import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("nr")
	@ObfuscatedGetter(
		intValue = -371192105
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -130212619
	)
	@Export("x")
	int x;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1248597615
	)
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1073291133
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("ag")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1868694145
	)
	int field1239;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1698768263
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -932232515
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2010968993
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -144191447
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -152072953
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1808202573
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1341114765
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1993879825
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1401897961
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("aq")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("aw")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("af")
	boolean field1248;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1654949393
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -275691641
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1592365515
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("an")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bd")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bt")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bq")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bu")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bl")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 637535539
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bz")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 800070667
	)
	int field1264;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -330797761
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1832573289
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 572579455
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1762760413
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 2078717111
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 643131463
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1848146093
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 272217185
	)
	int field1245;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1915525677
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 479634489
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1084268575
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 58747199
	)
	int field1287;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1377519793
	)
	int field1277;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 721291573
	)
	int field1278;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1049471373
	)
	int field1269;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 690610019
	)
	int field1280;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1504119385
	)
	int field1238;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -611848265
	)
	int field1265;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -61946015
	)
	int field1283;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 165021719
	)
	int field1284;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1280286129
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -881485665
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1173912475
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -906983361
	)
	int field1282;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1889632377
	)
	int field1289;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -664818219
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cn")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cs")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("cg")
	@Export("pathTraversed")
	byte[] pathTraversed;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 110165637
	)
	int field1294;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 313310131
	)
	int field1274;

	Actor() {
		this.isWalking = false;
		this.field1239 = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.overheadText = null;
		this.field1248 = false;
		this.overheadTextCyclesRemaining = 100;
		this.overheadTextColor = 0;
		this.overheadTextEffect = 0;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1264 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1245 = 0;
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1282 = 0;
		this.field1289 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new byte[10];
		this.field1294 = 0;
		this.field1274 = 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-6"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1557316570"
	)
	final void method2171() {
		this.pathLength = 0;
		this.field1274 = 0;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "31"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		boolean var8 = true;

		int var9;
		for (var9 = 0; var9 < 4; ++var9) {
			if (this.hitSplatCycles[var9] > var5) {
				var7 = false;
			} else {
				var8 = false;
			}
		}

		var9 = -1;
		int var10 = -1;
		int var11 = 0;
		if (var1 >= 0) {
			HitSplatDefinition var12 = Projectile.method1966(var1);
			var10 = var12.field1743;
			var11 = var12.field1731;
		}

		int var14;
		if (var8) {
			if (var10 == -1) {
				return;
			}

			var9 = 0;
			var14 = 0;
			if (var10 == 0) {
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) {
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) {
				if (var10 == 0) {
					if (this.hitSplatCycles[var13] < var14) {
						var9 = var13;
						var14 = this.hitSplatCycles[var13];
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) {
					var9 = var13;
					var14 = this.hitSplatValues[var13];
				}
			}

			if (var10 == 1 && var14 >= var2) {
				return;
			}
		} else {
			if (var7) {
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) {
				byte var15 = this.hitSplatCount;
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4);
				if (this.hitSplatCycles[var15] <= var5) {
					var9 = var15;
					break;
				}
			}
		}

		if (var9 >= 0) {
			this.hitSplatTypes[var9] = var1;
			this.hitSplatValues[var9] = var2;
			this.hitSplatTypes2[var9] = var3;
			this.hitSplatValues2[var9] = var4;
			this.hitSplatCycles[var9] = var5 + var11 + var6;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "-127"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = UserComparator6.method2492(var1);
		HealthBar var8 = null;
		HealthBar var9 = null;
		int var10 = var7.int2;
		int var11 = 0;

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) {
			++var11;
			if (var12.definition.field1596 == var7.field1596) {
				var12.put(var2 + var4, var5, var6, var3);
				return;
			}

			if (var12.definition.int1 <= var7.int1) {
				var8 = var12;
			}

			if (var12.definition.int2 > var10) {
				var9 = var12;
				var10 = var12.definition.int2;
			}
		}

		if (var9 != null || var11 < 4) {
			var12 = new HealthBar(var7);
			if (var8 == null) {
				this.healthBars.addLast(var12);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var12, var8);
			}

			var12.put(var2 + var4, var5, var6, var3);
			if (var11 >= 4) {
				var9.remove();
			}

		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-36"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = UserComparator6.method2492(var1);

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) {
			if (var2 == var3.definition) {
				var3.remove();
				return;
			}
		}

	}

	@ObfuscatedName("o")
	static final void method2191(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0;
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "325868949"
	)
	static void method2192(int var0, String var1) {
		int var2 = Players.Players_count;
		int[] var3 = Players.Players_indices;
		boolean var4 = false;
		Username var5 = new Username(var1, WorldMapSection0.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = Client.players[var3[var6]];
			if (var7 != null && var7 != class93.localPlayer && var7.username != null && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = class21.getPacketBufferNode(ClientPacket.field2597, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6619(var3[var6]);
					var8.packetBuffer.method6584(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = class21.getPacketBufferNode(ClientPacket.field2605, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6619(var3[var6]);
					var8.packetBuffer.method6584(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = class21.getPacketBufferNode(ClientPacket.field2636, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6581(0);
					var8.packetBuffer.method6602(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = class21.getPacketBufferNode(ClientPacket.field2620, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByte(0);
					var8.packetBuffer.method6602(var3[var6]);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			World.addGameMessage(4, "", "Unable to find " + var1);
		}

	}
}
