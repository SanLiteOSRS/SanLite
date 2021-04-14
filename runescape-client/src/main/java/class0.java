import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("f")
public class class0 extends class14 {
	@ObfuscatedName("rd")
	@ObfuscatedGetter(
		intValue = 1748086525
	)
	static int field6;
	@ObfuscatedName("p")
	@Export("SpriteBuffer_xOffsets")
	static int[] SpriteBuffer_xOffsets;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lbn;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("bp")
	static String field4;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		signature = "Lkq;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -962316939
	)
	int field0;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 1307131140437744357L
	)
	long field2;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		signature = "(Lu;)V"
	)
	class0(class2 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		this.field0 = var1.readInt();
		this.field2 = var1.readLong();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method157(this.field0, this.field2);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "([I[II)V",
		garbageValue = "-1322537982"
	)
	public static void method12(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			UserComparator3.ByteArrayPool_alternativeSizes = var0;
			class221.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			ScriptFrame.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < UserComparator3.ByteArrayPool_alternativeSizes.length; ++var2) {
				ScriptFrame.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
			}

		} else {
			UserComparator3.ByteArrayPool_alternativeSizes = null;
			class221.ByteArrayPool_altSizeArrayCounts = null;
			ScriptFrame.ByteArrayPool_arrays = null;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Object;ZB)[B",
		garbageValue = "69"
	)
	public static byte[] method11(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var3 = (byte[])((byte[])var0);
			return var1 ? ScriptFrame.method1175(var3) : var3;
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lir;I)V",
		garbageValue = "1509718075"
	)
	public static void method13(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "-2075885468"
	)
	static int method10(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		int var6;
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			class16.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			EnumComposition var5 = class159.getEnum(var3);
			if (var5.outputType != 's') {
			}

			for (var6 = 0; var6 < var5.outputCount; ++var6) {
				if (var4 == var5.keys[var6]) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.strVals[var6];
					var5 = null;
					break;
				}
			}

			if (var5 != null) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.defaultStr;
			}

			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				EnumComposition var10 = class159.getEnum(var3);
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var10.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			class16.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			int var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 3];
			EnumComposition var7 = class159.getEnum(var9);
			if (var3 == var7.inputType && var4 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var4 == 115) {
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var4 == 115) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}

				return 1;
			} else {
				if (var4 == 115) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}
}
