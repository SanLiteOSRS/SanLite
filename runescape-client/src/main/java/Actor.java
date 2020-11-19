import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -952501591
	)
	@Export("x")
	int x;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1794864455
	)
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -780515937
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("ay")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -955529005
	)
	int field1011;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 788781121
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 790102969
	)
	@Export("readySequence")
	int readySequence;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 457621463
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -276318067
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1230196885
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 560375303
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1465864773
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -994348101
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -974301415
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("am")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("aa")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("at")
	boolean field974;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1009044477
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 852014531
	)
	int field992;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -762307729
	)
	int field993;
	@ObfuscatedName("ap")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("ad")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bb")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bf")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bp")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bg")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		signature = "Ljs;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -49521303
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bl")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 81504171
	)
	int field1003;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1355414019
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 878455421
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 570882557
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -254649357
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1925242573
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1589867689
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1211840765
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -192373127
	)
	int field1022;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1626363285
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1912022721
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 806708579
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 419210595
	)
	int field1015;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1288579003
	)
	int field1016;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 2146213825
	)
	int field1017;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -972516227
	)
	int field1018;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -180985593
	)
	int field1019;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1137308257
	)
	int field1020;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 740782339
	)
	int field1009;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 968395653
	)
	int field1024;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1324873521
	)
	int field1023;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 2110040743
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 1789811467
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 501904063
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -816252921
	)
	int field1027;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1271802057
	)
	int field1028;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1827352877
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cy")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cx")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("ca")
	@Export("pathTraversed")
	byte[] pathTraversed;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1285644013
	)
	int field978;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 392864233
	)
	int field1034;

	Actor() {
		this.isWalking = false;
		this.field1011 = 1;
		this.readySequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.overheadText = null;
		this.field974 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field992 = 0;
		this.field993 = 0;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1003 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1022 = 0;
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1027 = 0;
		this.field1028 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new byte[10];
		this.field978 = 0;
		this.field1034 = 0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "2035007323"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-104"
	)
	final void method1845() {
		this.pathLength = 0;
		this.field1034 = 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		signature = "(IIIIIIB)V",
		garbageValue = "82"
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
			HitSplatDefinition var12 = class258.method4654(var1);
			var10 = var12.field3361;
			var11 = var12.field3370;
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		signature = "(IIIIIIS)V",
		garbageValue = "-1764"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
		HealthBarDefinition var7;
		if (var8 != null) {
			var7 = var8;
		} else {
			byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var8 = new HealthBarDefinition();
			if (var9 != null) {
				var8.decode(new Buffer(var9));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var8, (long)var1);
			var7 = var8;
		}

		var8 = var7;
		HealthBar var14 = null;
		HealthBar var10 = null;
		int var11 = var7.int2;
		int var12 = 0;

		HealthBar var13;
		for (var13 = (HealthBar)this.healthBars.last(); var13 != null; var13 = (HealthBar)this.healthBars.previous()) {
			++var12;
			if (var13.definition.field3310 == var8.field3310) {
				var13.put(var2 + var4, var5, var6, var3);
				return;
			}

			if (var13.definition.int1 <= var8.int1) {
				var14 = var13;
			}

			if (var13.definition.int2 > var11) {
				var10 = var13;
				var11 = var13.definition.int2;
			}
		}

		if (var10 != null || var12 < 4) {
			var13 = new HealthBar(var8);
			if (var14 == null) {
				this.healthBars.addLast(var13);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var13, var14);
			}

			var13.put(var2 + var4, var5, var6, var3);
			if (var12 >= 4) {
				var10.remove();
			}

		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1931669108"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
		HealthBarDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var3 = new HealthBarDefinition();
			if (var4 != null) {
				var3.decode(new Buffer(var4));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var3, (long)var1);
			var2 = var3;
		}

		var3 = var2;

		for (HealthBar var5 = (HealthBar)this.healthBars.last(); var5 != null; var5 = (HealthBar)this.healthBars.previous()) {
			if (var3 == var5.definition) {
				var5.remove();
				return;
			}
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(B)Lft;",
		garbageValue = "17"
	)
	public static Clock method1864() {
		try {
			return new NanoClock();
		} catch (Throwable var1) {
			return new MilliClock();
		}
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1341349782"
	)
	static void method1855() {
		PacketBufferNode var0 = class4.getPacketBufferNode(ClientPacket.field2272, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(UrlRequester.getWindowedMode());
		var0.packetBuffer.writeShort(ItemContainer.canvasWidth);
		var0.packetBuffer.writeShort(HealthBar.canvasHeight);
		Client.packetWriter.addNode(var0);
	}
}
