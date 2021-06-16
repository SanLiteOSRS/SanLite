import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eh")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("StructDefinition_archive")
	public static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("StructDefinition_cached")
	static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 456557527
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	StructComposition() {
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2004161330"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)V",
		garbageValue = "-59"
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "-606284417"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = class19.readStringIntParameters(var1, this.params);
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1271027205"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params;
		int var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = var5.integer;
			}
		}

		return var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "1"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return WorldMapElement.method2742(this.params, var1, var2);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lcf;",
		garbageValue = "15"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = MusicPatchNode.method4776(var1, var0);
		Script var5 = (Script)Script.Script_cached.get((long)(var3 << 16));
		Script var4;
		if (var5 != null) {
			var4 = var5;
		} else {
			String var6 = String.valueOf(var3);
			int var7 = Varcs.archive12.getGroupId(var6);
			if (var7 == -1) {
				var4 = null;
			} else {
				label58: {
					byte[] var8 = Varcs.archive12.takeFileFlat(var7);
					if (var8 != null) {
						if (var8.length <= 1) {
							var4 = null;
							break label58;
						}

						var5 = NetSocket.newScript(var8);
						if (var5 != null) {
							Script.Script_cached.put(var5, (long)(var3 << 16));
							var4 = var5;
							break label58;
						}
					}

					var4 = null;
				}
			}
		}

		if (var4 != null) {
			return var4;
		} else {
			var3 = VarbitComposition.method2935(var2, var0);
			Script var11 = (Script)Script.Script_cached.get((long)(var3 << 16));
			Script var12;
			if (var11 != null) {
				var12 = var11;
			} else {
				String var13 = String.valueOf(var3);
				int var9 = Varcs.archive12.getGroupId(var13);
				if (var9 == -1) {
					var12 = null;
				} else {
					byte[] var10 = Varcs.archive12.takeFileFlat(var9);
					if (var10 != null) {
						if (var10.length <= 1) {
							var12 = null;
							return var12 != null ? var12 : null;
						}

						var11 = NetSocket.newScript(var10);
						if (var11 != null) {
							Script.Script_cached.put(var11, (long)(var3 << 16));
							var12 = var11;
							return var12 != null ? var12 : null;
						}
					}

					var12 = null;
				}
			}

			return var12 != null ? var12 : null;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-560000506"
	)
	static int method2972(int var0, Script var1, boolean var2) {
		Widget var3 = WorldMapData_1.getWidget(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ModelData0.Widget_unpackTargetMask(class22.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}
}
