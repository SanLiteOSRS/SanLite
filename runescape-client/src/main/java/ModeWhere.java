import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("oo")
@Implements("ModeWhere")
public enum ModeWhere implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4356("", 0, new class368[]{class368.field4334, class368.field4337}),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4354("", 1, new class368[]{class368.field4336, class368.field4334, class368.field4337}),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4355("", 2, new class368[]{class368.field4336, class368.field4335, class368.field4334}),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4372("", 3, new class368[]{class368.field4336}),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4359("", 4),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4371("", 5, new class368[]{class368.field4336, class368.field4334}),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4361("", 6, new class368[]{class368.field4334}),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4360("", 8, new class368[]{class368.field4336, class368.field4334}),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4353("", 9, new class368[]{class368.field4336, class368.field4335}),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4362("", 10, new class368[]{class368.field4336}),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4363("", 11, new class368[]{class368.field4336}),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4364("", 12, new class368[]{class368.field4336, class368.field4334}),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4358("", 13, new class368[]{class368.field4336});

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = 365826603
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 556354953
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ac")
	final Set field4367;

	static {
		method6917();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Log;)V"
	)
	ModeWhere(String var3, int var4, class368[] var5) {
		this.field4367 = new HashSet();
		this.id = var4; // L: 41
		class368[] var6 = var5; // L: 43

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 44
			class368 var8 = var6[var7]; // L: 45
			this.field4367.add(var8); // L: 46
		}

	} // L: 49

	ModeWhere(String var3, int var4) {
		this.field4367 = new HashSet(); // L: 30
		this.id = var4; // L: 37
	} // L: 38

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 53
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lhj;",
		garbageValue = "251391217"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamComposition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0); // L: 23
			var1 = new ParamComposition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 26
			ParamComposition.ParamComposition_cached.put(var1, (long)var0); // L: 27
			return var1; // L: 28
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-149482019"
	)
	public static int method6929(int var0, int var1, int var2) {
		var2 &= 3; // L: 9
		if (var2 == 0) { // L: 10
			return var0;
		} else if (var2 == 1) { // L: 11
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1; // L: 12 13
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1878732942"
	)
	public static int method6930(int var0, int var1) {
		return (-3 - var0 << 8) + var1; // L: 18
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Loo;",
		garbageValue = "0"
	)
	static ModeWhere[] method6917() {
		return new ModeWhere[]{field4353, field4354, field4364, field4372, field4358, field4361, field4356, field4355, field4362, field4360, field4359, field4363, field4371}; // L: 33
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1816115459"
	)
	static int method6927(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2823
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2824
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field739.method4134(var3) ? 1 : 0; // L: 2825
			return 1; // L: 2826
		} else if (var0 == 3501) { // L: 2828
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2829
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field739.method4171(var3) ? 1 : 0; // L: 2830
			return 1; // L: 2831
		} else if (var0 == 3502) { // L: 2833
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2834
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field739.method4135(var3) ? 1 : 0; // L: 2835
			return 1; // L: 2836
		} else {
			return 2; // L: 2838
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1505941389"
	)
	static int method6928(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 4333
			Interpreter.Interpreter_intStackSize -= 2; // L: 4334
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4335
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4336
			if (!Client.isCameraLocked) { // L: 4337
				Client.camAngleX = var3; // L: 4338
				Client.camAngleY = var4; // L: 4339
			}

			return 1; // L: 4341
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 4343
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 4344
			return 1; // L: 4345
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 4347
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 4348
			return 1; // L: 4349
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 4351
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4352
			if (var3 < 0) { // L: 4353
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 4354
			return 1; // L: 4355
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 4357
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 4358
			return 1; // L: 4359
		} else {
			return 2; // L: 4361
		}
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(Lhy;IIII)V",
		garbageValue = "816261218"
	)
	static void method6916(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class10.clientPreferences.method2450() != 0) { // L: 3729
			if (var0.field2281 != null && var0.field2281.containsKey(var1)) { // L: 3730
				ClientPreferences.method2541((Integer)var0.field2281.get(var1), var2, var3); // L: 3731
			}
		}
	} // L: 3732

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Lmb;I)V",
		garbageValue = "-29045386"
	)
	static final void method6925(Widget var0) {
		if (var0.buttonType == 1) { // L: 11274
			class27.method391(var0.field3732, "", 24, 0, 0, var0.id, var0.itemId); // L: 11275
		}

		String var1;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 11278
			var1 = BuddyRankComparator.Widget_getSpellActionName(var0); // L: 11279
			if (var1 != null) { // L: 11280
				class27.method391(var1, class349.colorStartTag(65280) + var0.field3731, 25, 0, -1, var0.id, var0.itemId); // L: 11281
			}
		}

		if (var0.buttonType == 3) { // L: 11285
			class138.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 11286
		}

		if (var0.buttonType == 4) { // L: 11289
			class138.insertMenuItemNoShift(var0.field3732, "", 28, 0, 0, var0.id); // L: 11290
		}

		if (var0.buttonType == 5) { // L: 11293
			class138.insertMenuItemNoShift(var0.field3732, "", 29, 0, 0, var0.id); // L: 11294
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 11297
			class138.insertMenuItemNoShift(var0.field3732, "", 30, 0, -1, var0.id); // L: 11298
		}

		if (var0.isIf3) { // L: 11301
			int var2;
			if (Client.isSpellSelected) { // L: 11302
				var2 = StudioGame.getWidgetFlags(var0); // L: 11304
				boolean var5 = (var2 >> 21 & 1) != 0; // L: 11306
				if (var5 && (class125.selectedSpellFlags & 32) == 32) { // L: 11308
					class27.method391(Client.field671, Client.field716 + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId); // L: 11309
				}
			} else {
				for (int var7 = 9; var7 >= 5; --var7) { // L: 11314
					String var6 = class147.method3159(var0, var7); // L: 11315
					if (var6 != null) { // L: 11316
						class27.method391(var6, var0.dataText, 1007, var7 + 1, var0.childIndex, var0.id, var0.itemId); // L: 11317
					}
				}

				var1 = BuddyRankComparator.Widget_getSpellActionName(var0); // L: 11321
				if (var1 != null) { // L: 11322
					class27.method391(var1, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId); // L: 11323
				}

				for (var2 = 4; var2 >= 0; --var2) { // L: 11326
					String var3;
					if (!class60.method1131(StudioGame.getWidgetFlags(var0), var2) && var0.onOp == null) { // L: 11329
						var3 = null; // L: 11330
					} else if (var0.actions != null && var0.actions.length > var2 && var0.actions[var2] != null && var0.actions[var2].trim().length() != 0) { // L: 11333
						var3 = var0.actions[var2]; // L: 11337
					} else {
						var3 = null; // L: 11334
					}

					if (var3 != null) { // L: 11340
						WorldMapID.method5467(var3, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry); // L: 11341
					}
				}

				if (JagexCache.method3499(StudioGame.getWidgetFlags(var0))) { // L: 11345
					class138.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 11346
				}
			}
		}

	} // L: 11351
}
