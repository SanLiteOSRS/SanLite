import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("s")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("a")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("o")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1626628953
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -997141697
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("p")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("j")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("b")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	EnumComposition() {
		this.defaultStr = "null";
		this.outputCount = 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-1999375204"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lop;II)V",
		garbageValue = "498308918"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) {
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.strVals = new String[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readInt();
					this.strVals[var3] = var1.readStringCp1252NullTerminated();
				}
			} else if (var2 == 6) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.intVals = new int[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readInt();
					this.intVals[var3] = var1.readInt();
				}
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "689416040"
	)
	@Export("size")
	public int size() {
		return this.outputCount;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "211547863"
	)
	public static byte[] method3106(byte[] var0) {
		int var1 = var0.length;
		byte[] var2 = new byte[var1];
		System.arraycopy(var0, 0, var2, 0, var1);
		return var2;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1659130731"
	)
	static void method3097(boolean var0) {
		byte var1 = 0;
		boolean var2 = class408.clientPreferences.field1182 >= Client.field467;
		if (!var2) {
			var1 = 12;
		} else if (ArchiveLoader.client.method1166()) {
			var1 = 10;
		}

		class275.method5201(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			ReflectionCheck.field429 = 0;
			Tiles.otp = "";
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (class408.clientPreferences.rememberedUsername != null) {
				Login.Login_username = class408.clientPreferences.rememberedUsername;
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}
		}

		ParamComposition.method3216();
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "11"
	)
	static final void method3107(int var0, int var1, boolean var2) {
		if (!var2 || var0 != ItemLayer.field2243 || WallDecoration.field2630 != var1) {
			ItemLayer.field2243 = var0;
			WallDecoration.field2630 = var1;
			WorldMapData_1.updateGameState(25);
			class91.drawLoadingMessage("Loading - please wait.", true);
			int var3 = class19.baseX * 64;
			int var4 = DefaultsGroup.baseY * 64;
			class19.baseX = (var0 - 6) * 8;
			DefaultsGroup.baseY = (var1 - 6) * 8;
			int var5 = class19.baseX * 64 - var3;
			int var6 = DefaultsGroup.baseY * 64 - var4;
			var3 = class19.baseX * 64;
			var4 = DefaultsGroup.baseY * 64;

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) {
				NPC var19 = Client.npcs[var7];
				if (var19 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var19.pathX;
						var10000[var9] -= var5;
						var10000 = var19.pathY;
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128;
					var19.y -= var6 * 128;
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) {
				Player var22 = Client.players[var7];
				if (var22 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var22.pathX;
						var10000[var9] -= var5;
						var10000 = var22.pathY;
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128;
					var22.y -= var6 * 128;
				}
			}

			byte var20 = 0;
			byte var8 = 104;
			byte var21 = 1;
			if (var5 < 0) {
				var20 = 103;
				var8 = -1;
				var21 = -1;
			}

			byte var10 = 0;
			byte var11 = 104;
			byte var12 = 1;
			if (var6 < 0) {
				var10 = 103;
				var11 = -1;
				var12 = -1;
			}

			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) {
				for (var14 = var10; var11 != var14; var14 += var12) {
					int var15 = var13 + var5;
					int var16 = var6 + var14;

					for (int var17 = 0; var17 < 4; ++var17) {
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null;
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) {
				var18.x -= var5;
				var18.y -= var6;
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) {
					var18.remove();
				}
			}

			if (Client.destinationX != 0) {
				Client.destinationX -= var5;
				Client.destinationY -= var6;
			}

			Client.soundEffectCount = 0;
			Client.isCameraLocked = false;
			WorldMapSectionType.cameraX -= var5 << 7;
			class65.cameraZ -= var6 << 7;
			class320.oculusOrbFocalPointX -= var5 << 7;
			class18.oculusOrbFocalPointY -= var6 << 7;
			Client.field701 = -1;
			Client.graphicsObjects.clear();
			Client.projectiles.clear();

			for (var14 = 0; var14 < 4; ++var14) {
				Client.collisionMaps[var14].clear();
			}

		}
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "1038996465"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		ModelData0.insertMenuItem(var0, var1, var2, var3, var4, var5, false);
	}
}
