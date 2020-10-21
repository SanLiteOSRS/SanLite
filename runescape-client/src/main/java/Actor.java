import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cg")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2072659501
	)
	@Export("x")
	int x;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1621996049
	)
	@Export("y")
	int y;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -572229331
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1380153545
	)
	int field1014;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1649860163
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1340931717
	)
	@Export("readySequence")
	int readySequence;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1622912625
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1928797643
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 214300391
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1491970759
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -433468795
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1020521095
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1963413453
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("az")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("ad")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("ai")
	boolean field986;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 885225201
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 592862521
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 231964227
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("ak")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("ac")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bl")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bc")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bz")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bj")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		signature = "Ljv;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1685554577
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bg")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 171916113
	)
	int field1000;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 450756931
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1637238895
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 784527629
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -218661123
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1658984867
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1886437137
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1364114839
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1619964879
	)
	int field1009;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1569897565
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -475440643
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -822724081
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1684193507
	)
	int field1013;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1581183769
	)
	int field1003;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1750260439
	)
	int field997;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 681617707
	)
	int field1015;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 653700287
	)
	int field1016;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1078271285
	)
	int field1017;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1924227991
	)
	int field1026;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1759966281
	)
	int field1019;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -480648449
	)
	int field1027;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1077536781
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -446174757
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1431847965
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -813760125
	)
	int field1024;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -2006946605
	)
	int field1025;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -775156313
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cm")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cu")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("cw")
	@Export("pathTraversed")
	byte[] pathTraversed;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 829057405
	)
	int field1032;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1400209301
	)
	int field973;

	Actor() {
		this.isWalking = false;
		this.field1014 = 1;
		this.readySequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.overheadText = null;
		this.field986 = false;
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
		this.field1000 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1009 = 0;
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1024 = 0;
		this.field1025 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new byte[10];
		this.field1032 = 0;
		this.field973 = 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "68470795"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-15"
	)
	final void method1797() {
		this.pathLength = 0;
		this.field973 = 0;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		signature = "(IIIIIII)V",
		garbageValue = "733671711"
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
			HitSplatDefinition var12 = MusicPatchNode.method3929(var1);
			var10 = var12.field3365;
			var11 = var12.field3356;
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

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		signature = "(IIIIIIB)V",
		garbageValue = "-47"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = class204.method3780(var1);
		HealthBar var8 = null;
		HealthBar var9 = null;
		int var10 = var7.int2;
		int var11 = 0;

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) {
			++var11;
			if (var12.definition.field3314 == var7.field3314) {
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

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "-28"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = class204.method3780(var1);

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) {
			if (var2 == var3.definition) {
				var3.remove();
				return;
			}
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1035211538"
	)
	public static void method1810() {
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "(ILcy;ZI)I",
		garbageValue = "736101233"
	)
	static int method1798(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (class60.friendSystem.loadingProgress == 0) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -2;
			} else if (class60.friendSystem.loadingProgress == 1) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class60.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (class60.friendSystem.method1972() && var3 >= 0 && var3 < class60.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)class60.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (class60.friendSystem.method1972() && var3 >= 0 && var3 < class60.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class60.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (class60.friendSystem.method1972() && var3 >= 0 && var3 < class60.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class60.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize];
					int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					class279.method5092(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize];
					class60.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize];
					class60.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize];
					class60.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize];
					class60.friendSystem.removeIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize];
					var5 = SecureRandomCallable.method1202(var5);
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class60.friendSystem.isFriended(new Username(var5, WorldMapAreaData.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (Renderable.clanChat != null) {
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = Renderable.clanChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (Renderable.clanChat != null) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Renderable.clanChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (Renderable.clanChat != null && var3 < Renderable.clanChat.getSize()) {
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = Renderable.clanChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (Renderable.clanChat != null && var3 < Renderable.clanChat.getSize()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)Renderable.clanChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (Renderable.clanChat != null && var3 < Renderable.clanChat.getSize()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)Renderable.clanChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Renderable.clanChat != null ? Renderable.clanChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize];
					Frames.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Renderable.clanChat != null ? Renderable.clanChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize];
					MusicPatchNode.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					AbstractByteArrayCopier.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class60.friendSystem.method1972()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class60.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (class60.friendSystem.method1972() && var3 >= 0 && var3 < class60.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)class60.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize];
					var5 = SecureRandomCallable.method1202(var5);
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class60.friendSystem.isIgnored(new Username(var5, WorldMapAreaData.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (Renderable.clanChat != null && var3 < Renderable.clanChat.getSize() && Renderable.clanChat.get(var3).getUsername().equals(WorldMapLabelSize.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (Renderable.clanChat != null && Renderable.clanChat.owner != null) {
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = Renderable.clanChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (Renderable.clanChat != null && var3 < Renderable.clanChat.getSize() && ((FriendsChatMember)Renderable.clanChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class60.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class60.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class60.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class60.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class60.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class60.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class60.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class60.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class60.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class60.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class60.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							class60.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							class60.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class60.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class60.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							class60.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (Renderable.clanChat != null) {
								Renderable.clanChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Renderable.clanChat != null) {
								Renderable.clanChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Renderable.clanChat != null) {
								Renderable.clanChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Renderable.clanChat != null) {
								Renderable.clanChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Renderable.clanChat != null) {
								Renderable.clanChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Renderable.clanChat != null) {
								Renderable.clanChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Renderable.clanChat != null) {
								Renderable.clanChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Renderable.clanChat != null) {
								Renderable.clanChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Renderable.clanChat != null) {
								Renderable.clanChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Renderable.clanChat != null) {
								Renderable.clanChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Renderable.clanChat != null) {
								Renderable.clanChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (Renderable.clanChat != null) {
								Renderable.clanChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class60.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Renderable.clanChat != null) {
								Renderable.clanChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (Renderable.clanChat != null && var3 < Renderable.clanChat.getSize() && ((FriendsChatMember)Renderable.clanChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-48"
	)
	static final void method1805() {
		class2.method41();
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
		KitDefinition.KitDefinition_cached.clear();
		method1810();
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
		GameObject.method3412();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		NetSocket.method3626();
		GrandExchangeEvents.method143();
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
		ArchiveDiskAction.method4233();
		CollisionMap.method3653();
		Varps.method4066();
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		SecureRandomCallable.method1203();
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear();
		Script.Script_cached.clear();
		class182.archive0.clearFiles();
		Client.archive1.clearFiles();
		WorldMapID.archive3.clearFiles();
		GrandExchangeOfferUnitPriceComparator.archive4.clearFiles();
		WorldMapLabel.archive5.clearFiles();
		CollisionMap.archive6.clearFiles();
		WorldMapSection1.archive7.clearFiles();
		Huffman.archive8.clearFiles();
		UrlRequester.archive9.clearFiles();
		Occluder.archive10.clearFiles();
		GrandExchangeEvent.archive11.clearFiles();
		ApproximateRouteStrategy.archive12.clearFiles();
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1341362245"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = ItemComposition.fontPlain12.lineWidth(var0, 250);
			int var6 = ItemComposition.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var2 + var6, 16777215);
			ItemComposition.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			int var7 = var3 - var2;
			int var8 = var4 - var2;
			int var9 = var5 + var2 + var2;
			int var10 = var2 + var6 + var2;

			for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
				if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) {
					Client.field882[var11] = true;
				}
			}

			if (var1) {
				WorldMapSprite.rasterProvider.drawFull(0, 0);
			} else {
				HealthBarUpdate.method1817(var3, var4, var5, var6);
			}

		}
	}
}
