import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mv")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive18")
	static Archive archive18;
	@ObfuscatedName("r")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Lee;",
		garbageValue = "743368656"
	)
	public static VarbitComposition method6299(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var1 = new VarbitComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILgt;[Lfz;I)V",
		garbageValue = "305716239"
	)
	static final void method6296(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0);
		int var11 = -1;

		while (true) {
			int var12 = var10.method6560();
			if (var12 == 0) {
				return;
			}

			var11 += var12;
			int var13 = 0;

			while (true) {
				int var14 = var10.readUShortSmart();
				if (var14 == 0) {
					break;
				}

				var13 += var14 - 1;
				int var15 = var13 & 63;
				int var16 = var13 >> 6 & 63;
				int var17 = var13 >> 12;
				int var18 = var10.readUnsignedByte();
				int var19 = var18 >> 2;
				int var20 = var18 & 3;
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
					ObjectComposition var21 = class23.getObjectDefinition(var11);
					int var24 = var16 & 7;
					int var25 = var15 & 7;
					int var27 = var21.sizeX;
					int var28 = var21.sizeY;
					int var29;
					if ((var20 & 1) == 1) {
						var29 = var27;
						var27 = var28;
						var28 = var29;
					}

					int var26 = var7 & 3;
					int var23;
					if (var26 == 0) {
						var23 = var24;
					} else if (var26 == 1) {
						var23 = var25;
					} else if (var26 == 2) {
						var23 = 7 - var24 - (var27 - 1);
					} else {
						var23 = 7 - var25 - (var28 - 1);
					}

					var29 = var23 + var2;
					int var30 = var3 + class179.method3635(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
					if (var29 > 0 && var30 > 0 && var29 < 103 && var30 < 103) {
						int var31 = var1;
						if ((Tiles.Tiles_renderFlags[1][var29][var30] & 2) == 2) {
							var31 = var1 - 1;
						}

						CollisionMap var32 = null;
						if (var31 >= 0) {
							var32 = var9[var31];
						}

						class9.method89(var1, var29, var30, var11, var20 + var7 & 3, var19, var8, var32);
					}
				}
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1272154519"
	)
	static int method6298(int var0, Script var1, boolean var2) {
		Widget var3 = Frames.getWidget(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANSTOP) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANSBOT) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLMODE) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else if (var0 != 2615 && var0 != 2616) {
			return 2;
		} else {
			++class44.Interpreter_intStackSize;
			return 1;
		}
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(IZZZB)Ljp;",
		garbageValue = "28"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
		ArchiveDisk var4 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class93.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var4, class43.masterDisk, var0, var1, var2, var3);
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-81607341"
	)
	public static boolean method6297() {
		return Client.staffModLevel >= 2;
	}
}
