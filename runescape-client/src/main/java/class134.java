import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fc")
public class class134 implements class125 {
	@ObfuscatedName("gb")
	static String field1618;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "-1827607701"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 68

		for (int var6 = 0; var6 < var5; ++var6) { // L: 69
			char var7 = var0.charAt(var6 + var1); // L: 70
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 71
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 72
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 73
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 74
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 75
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 76
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 77
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 78
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120; // L: 79
			} else if (var7 == 8240) { // L: 80
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 81
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 82
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 83
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 84
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 85
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 86
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 87
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 88
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 89
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 90
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105; // L: 91
			} else if (var7 == 732) { // L: 92
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 93
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 94
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 95
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 96
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 97
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 98
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 99
			}
		}

		return var5; // L: 101
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZB)I",
		garbageValue = "32"
	)
	static int method3072(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2861
			class19.Interpreter_intStackSize -= 2; // L: 2862
			var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 2863
			var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 2864
			EnumComposition var10 = class162.getEnum(var3); // L: 2865
			if (var10.outputType != 's') { // L: 2866
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2867
				if (var9 == var10.keys[var6]) { // L: 2868
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2869
					var10 = null; // L: 2870
					break;
				}
			}

			if (var10 != null) { // L: 2874
				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2875
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2877
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2903
				var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2904
				EnumComposition var4 = class162.getEnum(var3); // L: 2905
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4.size(); // L: 2906
				return 1; // L: 2907
			} else {
				return 2; // L: 2909
			}
		} else {
			class19.Interpreter_intStackSize -= 4; // L: 2878
			var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 2879
			var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 2880
			int var5 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 2881
			var6 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 3]; // L: 2882
			EnumComposition var7 = class162.getEnum(var5); // L: 2883
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2884
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2889
					if (var6 == var7.keys[var8]) { // L: 2890
						if (var9 == 115) { // L: 2891
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2892
						}

						var7 = null; // L: 2893
						break;
					}
				}

				if (var7 != null) { // L: 2897
					if (var9 == 115) { // L: 2898
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2899
					}
				}

				return 1; // L: 2901
			} else {
				if (var9 == 115) { // L: 2885
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 2886
				}

				return 1; // L: 2887
			}
		}
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "54"
	)
	static final void method3073(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class19.guestClanChannel; // L: 12763
		if (var2 != null && var1 >= 0 && var1 < var2.method3394()) { // L: 12764
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 12765
			if (var3.rank == -1) { // L: 12766
				String var4 = var3.username.getName(); // L: 12767
				PacketBufferNode var5 = class425.getPacketBufferNode(ClientPacket.field3250, Client.packetWriter.isaacCipher); // L: 12768
				var5.packetBuffer.writeByte(3 + SequenceDefinition.stringCp1252NullTerminatedByteSize(var4)); // L: 12769
				var5.packetBuffer.writeByte(var0); // L: 12770
				var5.packetBuffer.writeShort(var1); // L: 12771
				var5.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 12772
				Client.packetWriter.addNode(var5); // L: 12773
			}
		}
	} // L: 12774
}
