import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bf")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		signature = "Lfd;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		signature = "Lld;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lku;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 262221405
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1053442849
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("o")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1265290789
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2038384431
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1117584059
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1379087493
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1569239967
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 658942553
	)
	int field645;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 232655151
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1335611075
	)
	int field640;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Ler;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 896754859
	)
	int field649;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 177396383
	)
	int field635;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -797190095
	)
	int field651;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -191920347
	)
	int field643;
	@ObfuscatedName("j")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1988252929
	)
	@Export("team")
	int team;
	@ObfuscatedName("u")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -398923579
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1030686615
	)
	@Export("index")
	int index;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lkm;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lkm;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ab")
	boolean field660;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 321223155
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1001779515
	)
	@Export("tileY")
	int tileY;

	Player() {
		this.headIconPk = -1;
		this.headIconPrayer = -1;
		this.actions = new String[3];

		for (int var1 = 0; var1 < 3; ++var1) {
			this.actions[var1] = "";
		}

		this.combatLevel = 0;
		this.skillLevel = 0;
		this.animationCycleStart = 0;
		this.animationCycleEnd = 0;
		this.isUnanimated = false;
		this.team = 0;
		this.isHidden = false;
		this.isFriendTriBool = TriBool.TriBool_unknown;
		this.isInClanChat = TriBool.TriBool_unknown;
		this.field660 = false;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lkf;I)V",
		garbageValue = "-1567604648"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0;
		int var2 = var1.readUnsignedByte();
		this.headIconPk = var1.readByte();
		this.headIconPrayer = var1.readByte();
		int var3 = -1;
		this.team = 0;
		int[] var4 = new int[12];

		int var6;
		int var7;
		for (int var5 = 0; var5 < 12; ++var5) {
			var6 = var1.readUnsignedByte();
			if (var6 == 0) {
				var4[var5] = 0;
			} else {
				var7 = var1.readUnsignedByte();
				var4[var5] = var7 + (var6 << 8);
				if (var5 == 0 && var4[0] == 65535) {
					var3 = var1.readUnsignedShort();
					break;
				}

				if (var4[var5] >= 512) {
					int var8 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var4[var5] - 512).team;
					if (var8 != 0) {
						this.team = var8;
					}
				}
			}
		}

		int[] var9 = new int[5];

		for (var6 = 0; var6 < 5; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 < 0 || var7 >= WorldMapSprite.field253[var6].length) {
				var7 = 0;
			}

			var9[var6] = var7;
		}

		super.readySequence = var1.readUnsignedShort();
		if (super.readySequence == 65535) {
			super.readySequence = -1;
		}

		super.turnLeftSequence = var1.readUnsignedShort();
		if (super.turnLeftSequence == 65535) {
			super.turnLeftSequence = -1;
		}

		super.turnRightSequence = super.turnLeftSequence;
		super.walkSequence = var1.readUnsignedShort();
		if (super.walkSequence == 65535) {
			super.walkSequence = -1;
		}

		super.walkBackSequence = var1.readUnsignedShort();
		if (super.walkBackSequence == 65535) {
			super.walkBackSequence = -1;
		}

		super.walkLeftSequence = var1.readUnsignedShort();
		if (super.walkLeftSequence == 65535) {
			super.walkLeftSequence = -1;
		}

		super.walkRightSequence = var1.readUnsignedShort();
		if (super.walkRightSequence == 65535) {
			super.walkRightSequence = -1;
		}

		super.runSequence = var1.readUnsignedShort();
		if (super.runSequence == 65535) {
			super.runSequence = -1;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), WorldMapAreaData.loginType);
		this.clearIsFriend();
		this.clearIsInClanChat();
		if (this == WorldMapLabelSize.localPlayer) {
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.isHidden = false;
		}

		if (this.appearance == null) {
			this.appearance = new PlayerComposition();
		}

		this.appearance.update(var4, var9, var2 == 1, var3);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-659819020"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1737435180"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1949087224"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class60.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "73"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "94"
	)
	@Export("clearIsInClanChat")
	void clearIsInClanChat() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2055605300"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		this.isInClanChat = Renderable.clanChat != null && Renderable.clanChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1374983546"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? Skeleton.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)Ler;",
		garbageValue = "-2026237468"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? WorldMapRegion.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence != -1 && !this.isUnanimated && (super.readySequence != super.movementSequence || var1 == null) ? WorldMapRegion.SequenceDefinition_get(super.movementSequence) : null;
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					var4 = Tiles.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.field1003, 0);
						var5 = new Model[]{var3, var4};
						var3 = new Model(var5, 2);
					}
				}

				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						var4 = this.model0;
						var4.offsetBy(this.field645 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field640 * 4096 - super.y);
						if (super.orientation == 512) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						} else if (super.orientation == 1024) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						} else if (super.orientation == 1536) {
							var4.rotateY90Ccw();
						}

						var5 = new Model[]{var3, var4};
						var3 = new Model(var5, 2);
						if (super.orientation == 512) {
							var4.rotateY90Ccw();
						} else if (super.orientation == 1024) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						} else if (super.orientation == 1536) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						}

						var4.offsetBy(super.x - this.field645 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field640 * 4096);
					}
				}

				var3.isSingleTile = true;
				return var3;
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(IIBI)V",
		garbageValue = "954112592"
	)
	final void method1286(int var1, int var2, byte var3) {
		if (super.sequence != -1 && WorldMapRegion.SequenceDefinition_get(super.sequence).field3541 == 1) {
			super.sequence = -1;
		}

		super.field1000 = -1;
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var3 == 2) {
					PacketBuffer.method5598(this, var1, var2, (byte)2);
				}

				this.method1288(var1, var2, var3);
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-1761567284"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field973 = 0;
		super.field1032 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = super.pathX[0] * 128 + var3 * 64;
		super.y = var3 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(IIBB)V",
		garbageValue = "5"
	)
	final void method1288(int var1, int var2, byte var3) {
		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) {
			super.pathX[var4] = super.pathX[var4 - 1];
			super.pathY[var4] = super.pathY[var4 - 1];
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1];
		}

		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.pathTraversed[0] = var3;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "68470795"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lkf;Ljava/lang/String;I)I",
		garbageValue = "-1169357315"
	)
	public static int method1326(Buffer var0, String var1) {
		int var2 = var0.offset;
		byte[] var3 = EnumComposition.method4644(var1);
		var0.writeSmartByteShort(var3.length);
		var0.offset += class219.huffman.compress(var3, 0, var3.length, var0.array, var0.offset);
		return var0.offset - var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(IIIIB)V",
		garbageValue = "-94"
	)
	static final void method1327(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) {
			for (int var5 = var0; var5 <= var0 + var2; ++var5) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					class22.field122[0][var5][var4] = 127;
					if (var0 == var5 && var5 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(Lkr;Lkr;Lkr;B)V",
		garbageValue = "-76"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (FloorDecoration.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		IsaacCipher.loginBoxCenter = Login.loginBoxX + 180;
		if (Login.worldSelectOpen) {
			ItemComposition.method4823(var0, var1);
		} else {
			UserComparator2.leftTitleSprite.drawAt(Login.xPadding, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			AbstractByteArrayCopier.logoSprite.drawAt(Login.xPadding + 382 - AbstractByteArrayCopier.logoSprite.subWidth / 2, 18);
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) {
				byte var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var5;
			String var19;
			short var22;
			int var23;
			short var24;
			if (Client.gameState == 20) {
				class296.titleboxSprite.drawAt(Login.loginBoxX + 180 - class296.titleboxSprite.subWidth / 2, 271 - class296.titleboxSprite.subHeight / 2);
				var22 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16776960, 0);
				var23 = var22 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16776960, 0);
				var23 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16776960, 0);
				var23 += 15;
				var23 += 7;
				if (Login.loginIndex != 4) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var23, 16777215, 0);
					var24 = 200;

					for (var5 = WorldMapRectangle.method359(); var0.stringWidth(var5) > var24; var5 = var5.substring(0, var5.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var23, 16777215, 0);
					var23 += 15;

					for (var19 = FontName.method5445(Login.Login_password); var0.stringWidth(var19) > var24; var19 = var19.substring(1)) {
					}

					var0.draw("Password: " + var19, Login.loginBoxX + 180 - 108, var23, 16777215, 0);
					var23 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) {
				class296.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var17;
				if (Login.loginIndex == 0) {
					var22 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var22, 16776960, 0);
					var23 = var22 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var17 = 291;
					ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
					var0.drawLines("New User", var4 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
					var0.drawLines("Existing User", var4 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var22 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16777215, 0);
					var23 = var22 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16777215, 0);
					var23 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16777215, 0);
					var23 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var17 = 321;
					ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
					var0.drawCentered("Continue", var4, var17 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
					var0.drawCentered("Cancel", var4, var17 + 5, 16777215, 0);
				} else {
					int var7;
					if (Login.loginIndex == 2) {
						var22 = 201;
						var0.drawCentered(Login.Login_response1, IsaacCipher.loginBoxCenter, var22, 16776960, 0);
						var23 = var22 + 15;
						var0.drawCentered(Login.Login_response2, IsaacCipher.loginBoxCenter, var23, 16776960, 0);
						var23 += 15;
						var0.drawCentered(Login.Login_response3, IsaacCipher.loginBoxCenter, var23, 16776960, 0);
						var23 += 15;
						var23 += 7;
						var0.draw("Login: ", IsaacCipher.loginBoxCenter - 110, var23, 16777215, 0);
						var24 = 200;

						for (var5 = WorldMapRectangle.method359(); var0.stringWidth(var5) > var24; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? WorldMapAreaData.colorStartTag(16776960) + "|" : ""), IsaacCipher.loginBoxCenter - 70, var23, 16777215, 0);
						var23 += 15;

						for (var19 = FontName.method5445(Login.Login_password); var0.stringWidth(var19) > var24; var19 = var19.substring(1)) {
						}

						var0.draw("Password: " + var19 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? WorldMapAreaData.colorStartTag(16776960) + "|" : ""), IsaacCipher.loginBoxCenter - 108, var23, 16777215, 0);
						var23 += 15;
						var22 = 277;
						var7 = IsaacCipher.loginBoxCenter + -117;
						boolean var9 = Client.Login_isUsernameRemembered;
						boolean var10 = Login.field1224;
						IndexedSprite var8 = var9 ? (var10 ? Login.field1221 : MusicPatchNode2.options_buttons_2Sprite) : (var10 ? PlayerType.field3134 : class227.options_buttons_0Sprite);
						var8.drawAt(var7, var22);
						var7 = var7 + var8.subWidth + 5;
						var1.draw("Remember username", var7, var22 + 13, 16776960, 0);
						var7 = IsaacCipher.loginBoxCenter + 24;
						boolean var13 = Tile.clientPreferences.hideUsername;
						boolean var14 = Login.field1201;
						IndexedSprite var12 = var13 ? (var14 ? Login.field1221 : MusicPatchNode2.options_buttons_2Sprite) : (var14 ? PlayerType.field3134 : class227.options_buttons_0Sprite);
						var12.drawAt(var7, var22);
						var7 = var7 + var12.subWidth + 5;
						var1.draw("Hide username", var7, var22 + 13, 16776960, 0);
						var23 = var22 + 15;
						int var15 = IsaacCipher.loginBoxCenter - 80;
						short var16 = 321;
						ModelData0.titlebuttonSprite.drawAt(var15 - 73, var16 - 20);
						var0.drawCentered("Login", var15, var16 + 5, 16777215, 0);
						var15 = IsaacCipher.loginBoxCenter + 80;
						ModelData0.titlebuttonSprite.drawAt(var15 - 73, var16 - 20);
						var0.drawCentered("Cancel", var15, var16 + 5, 16777215, 0);
						var22 = 357;
						switch(Login.field1213) {
						case 2:
							ModelData0.field1904 = "Having trouble logging in?";
							break;
						default:
							ModelData0.field1904 = "Can't login? Click here.";
						}

						GrandExchangeOfferNameComparator.field112 = new Bounds(IsaacCipher.loginBoxCenter, var22, var1.stringWidth(ModelData0.field1904), 11);
						MusicPatchPcmStream.field2519 = new Bounds(IsaacCipher.loginBoxCenter, var22, var1.stringWidth("Still having trouble logging in?"), 11);
						var1.drawCentered(ModelData0.field1904, IsaacCipher.loginBoxCenter, var22, 16777215, 0);
					} else if (Login.loginIndex == 3) {
						var22 = 201;
						var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var22, 16776960, 0);
						var23 = var22 + 20;
						var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var23, 16776960, 0);
						var23 += 15;
						var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var23, 16776960, 0);
						var23 += 15;
						var4 = Login.loginBoxX + 180;
						var17 = 276;
						ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
						var2.drawCentered("Try again", var4, var17 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var17 = 326;
						ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
						var2.drawCentered("Forgotten password?", var4, var17 + 5, 16777215, 0);
					} else {
						short var20;
						if (Login.loginIndex == 4) {
							var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
							var22 = 236;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16777215, 0);
							var23 = var22 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16777215, 0);
							var23 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16777215, 0);
							var23 += 15;
							var0.draw("PIN: " + FontName.method5445(WorldMapLabelSize.otp) + (Client.cycle % 40 < 20 ? WorldMapAreaData.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var23, 16777215, 0);
							var23 -= 8;
							var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var23, 16776960, 0);
							var23 += 15;
							var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var23, 16776960, 0);
							var4 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
							int var27 = var23 - var0.ascent;
							IndexedSprite var29;
							if (Login.field1223) {
								var29 = MusicPatchNode2.options_buttons_2Sprite;
							} else {
								var29 = class227.options_buttons_0Sprite;
							}

							var29.drawAt(var4, var27);
							var23 += 15;
							var7 = Login.loginBoxX + 180 - 80;
							var20 = 321;
							ModelData0.titlebuttonSprite.drawAt(var7 - 73, var20 - 20);
							var0.drawCentered("Continue", var7, var20 + 5, 16777215, 0);
							var7 = Login.loginBoxX + 180 + 80;
							ModelData0.titlebuttonSprite.drawAt(var7 - 73, var20 - 20);
							var0.drawCentered("Cancel", var7, var20 + 5, 16777215, 0);
							var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var20 + 36, 255, 0);
						} else if (Login.loginIndex == 5) {
							var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
							var22 = 221;
							var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16776960, 0);
							var23 = var22 + 15;
							var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var23 += 14;
							var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var23, 16777215, 0);
							var24 = 174;

							for (var5 = WorldMapRectangle.method359(); var0.stringWidth(var5) > var24; var5 = var5.substring(1)) {
							}

							var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? WorldMapAreaData.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var23, 16777215, 0);
							var23 += 15;
							int var6 = Login.loginBoxX + 180 - 80;
							short var26 = 321;
							ModelData0.titlebuttonSprite.drawAt(var6 - 73, var26 - 20);
							var0.drawCentered("Recover", var6, var26 + 5, 16777215, 0);
							var6 = Login.loginBoxX + 180 + 80;
							ModelData0.titlebuttonSprite.drawAt(var6 - 73, var26 - 20);
							var0.drawCentered("Back", var6, var26 + 5, 16777215, 0);
							var26 = 356;
							var1.drawCentered("Still having trouble logging in?", IsaacCipher.loginBoxCenter, var26, 268435455, 0);
						} else if (Login.loginIndex == 6) {
							var22 = 201;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16776960, 0);
							var23 = var22 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var4 = Login.loginBoxX + 180;
							var17 = 321;
							ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
							var0.drawCentered("Back", var4, var17 + 5, 16777215, 0);
						} else if (Login.loginIndex == 7) {
							var22 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var22, 16776960, 0);
							var23 = var22 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var17 = 321;
							ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
							var0.drawCentered("Set Date of Birth", var4, var17 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
							var0.drawCentered("Back", var4, var17 + 5, 16777215, 0);
						} else if (Login.loginIndex == 8) {
							var22 = 216;
							var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var22, 16776960, 0);
							var23 = var22 + 15;
							var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var17 = 321;
							ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
							var0.drawCentered("Privacy Policy", var4, var17 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
							var0.drawCentered("Back", var4, var17 + 5, 16777215, 0);
						} else if (Login.loginIndex == 12) {
							var22 = 201;
							String var21 = "";
							var5 = "";
							var19 = "";
							switch(Login.field1210) {
							case 0:
								var21 = "Your account has been disabled.";
								var5 = Strings.field2988;
								var19 = "";
								break;
							case 1:
								var21 = "Account locked as we suspect it has been stolen.";
								var5 = Strings.field2936;
								var19 = "";
								break;
							default:
								class41.Login_promptCredentials(false);
							}

							var0.drawCentered(var21, Login.loginBoxX + 180, var22, 16776960, 0);
							var23 = var22 + 15;
							var2.drawCentered(var5, Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var2.drawCentered(var19, Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var7 = Login.loginBoxX + 180;
							var20 = 276;
							ModelData0.titlebuttonSprite.drawAt(var7 - 73, var20 - 20);
							var0.drawCentered("Support Page", var7, var20 + 5, 16777215, 0);
							var7 = Login.loginBoxX + 180;
							var20 = 326;
							ModelData0.titlebuttonSprite.drawAt(var7 - 73, var20 - 20);
							var0.drawCentered("Back", var7, var20 + 5, 16777215, 0);
						} else if (Login.loginIndex == 24) {
							var22 = 221;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16777215, 0);
							var23 = var22 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16777215, 0);
							var23 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16777215, 0);
							var23 += 15;
							var4 = Login.loginBoxX + 180;
							var17 = 301;
							ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
							var0.drawCentered("Ok", var4, var17 + 5, 16777215, 0);
						}
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var18 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var18);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, GameEngine.canvasHeight);
				Varcs.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				Varcs.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var18);
			}

			ClientPreferences.title_muteSprite[Tile.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && class58.clientLanguage == Language.Language_EN) {
				if (class7.field36 != null) {
					var23 = Login.xPadding + 5;
					var24 = 463;
					byte var28 = 100;
					byte var25 = 35;
					class7.field36.drawAt(var23, var24);
					var0.drawCentered("World" + " " + Client.worldId, var28 / 2 + var23, var25 / 2 + var24 - 2, 16777215, 0);
					if (WorldMapScaleHandler.World_request != null) {
						var1.drawCentered("Loading...", var28 / 2 + var23, var25 / 2 + var24 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var28 / 2 + var23, var25 / 2 + var24 + 12, 16777215, 0);
					}
				} else {
					class7.field36 = class234.SpriteBuffer_getIndexedSpriteByName(Huffman.archive8, "sl_button", "");
				}
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		signature = "(ILcy;ZI)I",
		garbageValue = "750694700"
	)
	static int method1324(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = Huffman.Client_plane;
			int var9 = WorldMapManager.baseX * 64 + (WorldMapLabelSize.localPlayer.x >> 7);
			int var5 = WorldMapLabel.baseY * 64 + (WorldMapLabelSize.localPlayer.y >> 7);
			WorldMapSection0.getWorldMap().method6482(var3, var9, var5, true);
			return 1;
		} else {
			WorldMapArea var11;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				String var16 = "";
				var11 = WorldMapSection0.getWorldMap().getMapArea(var3);
				if (var11 != null) {
					var16 = var11.getExternalName();
				}

				Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				WorldMapSection0.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				WorldMapSection0.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var15;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
					WorldMapSection0.getWorldMap().setWorldMapPositionTarget(var15.x, var15.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
					WorldMapSection0.getWorldMap().setWorldMapPositionTargetInstant(var15.x, var15.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
					WorldMapSection0.getWorldMap().jumpToSourceCoord(var15.plane, var15.x, var15.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
					WorldMapSection0.getWorldMap().jumpToSourceCoordInstant(var15.plane, var15.x, var15.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var13;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var13 = WorldMapSection0.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var13 = WorldMapSection0.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var13.getRegionHighX() - var13.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var13.getRegionHighY() - var13.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var13 = WorldMapSection0.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var13 = WorldMapSection0.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var15 = WorldMapSection0.getWorldMap().getDisplayCoord();
						if (var15 == null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var15.x;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var15.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var15 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
						var13 = WorldMapSection0.getWorldMap().getCurrentMapArea();
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var14 = var13.position(var15.plane, var15.x, var15.y);
							if (var14 == null) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14[0];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14[1];
							}

							return 1;
						}
					} else {
						Coord var7;
						if (var0 == 6618) {
							var15 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
							var13 = WorldMapSection0.getWorldMap().getCurrentMapArea();
							if (var13 == null) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var7 = var13.coord(var15.x, var15.y);
								if (var7 == null) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.packed();
								}

								return 1;
							}
						} else {
							Coord var12;
							if (var0 == 6619) {
								Interpreter.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								var12 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
								MouseHandler.method1150(var3, var12, false);
								return 1;
							} else if (var0 == 6620) {
								Interpreter.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								var12 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
								MouseHandler.method1150(var3, var12, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								Interpreter.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								var12 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
								var11 = WorldMapSection0.getWorldMap().getMapArea(var3);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.containsCoord(var12.plane, var12.x, var12.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var15 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
								var13 = WorldMapSection0.getWorldMap().mapAreaAtCoord(var15.plane, var15.x, var15.y);
								if (var13 == null) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								WorldMapSection0.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								WorldMapSection0.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								WorldMapSection0.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								WorldMapSection0.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var10;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
									WorldMapSection0.getWorldMap().setPerpetualFlash(var10);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
									WorldMapSection0.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
									WorldMapSection0.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									WorldMapSection0.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
									WorldMapSection0.getWorldMap().setElementsDisabled(var10);
									return 1;
								} else {
									boolean var4;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										Interpreter.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
										var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
										WorldMapSection0.getWorldMap().disableElement(var3, var4);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										Interpreter.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
										var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
										WorldMapSection0.getWorldMap().setCategoryDisabled(var3, var4);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										Interpreter.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
										var12 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
										var7 = WorldMapSection0.getWorldMap().method6507(var3, var12);
										if (var7 == null) {
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var8;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var8 = WorldMapSection0.getWorldMap().iconStart();
											if (var8 == null) {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8.getElement();
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var8 = WorldMapSection0.getWorldMap().iconNext();
											if (var8 == null) {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8.getElement();
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var6;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
												var6 = WorldMapSection0.WorldMapElement_get(var3);
												if (var6.name == null) {
													Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var6.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
												var6 = WorldMapSection0.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
												var6 = WorldMapSection0.WorldMapElement_get(var3);
												if (var6 == null) {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
												var6 = WorldMapSection0.WorldMapElement_get(var3);
												if (var6 == null) {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Frames.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Frames.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Frames.worldMapEvent.coord2.packed();
												return 1;
											} else {
												return 2;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
