import java.util.Date;
import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ib")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Llv;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1001154339
	)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Llp;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2117538937
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Llp;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1463205401
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Ljv;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Llp;"
	)
	@Export("NetCache_pendingWrites")
	public static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -479037579
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Llp;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1632634127
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("n")
	static boolean field3200;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Liz;"
	)
	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lkb;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "Lkb;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -795437201
	)
	public static int field3190;
	@ObfuscatedName("j")
	@Export("NetCache_crc")
	static CRC32 NetCache_crc;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "[Lid;"
	)
	@Export("NetCache_archives")
	static Archive[] NetCache_archives;
	@ObfuscatedName("d")
	public static byte field3207;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 473266479
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1034207799
	)
	@Export("NetCache_ioExceptions")
	public static int NetCache_ioExceptions;

	static {
		NetCache_loadTime = 0;
		NetCache_pendingPriorityWrites = new NodeHashTable(4096);
		NetCache_pendingPriorityWritesCount = 0;
		NetCache_pendingPriorityResponses = new NodeHashTable(32);
		NetCache_pendingPriorityResponsesCount = 0;
		NetCache_pendingWritesQueue = new DualNodeDeque();
		NetCache_pendingWrites = new NodeHashTable(4096);
		NetCache_pendingWritesCount = 0;
		NetCache_pendingResponses = new NodeHashTable(4096);
		NetCache_pendingResponsesCount = 0;
		NetCache_responseHeaderBuffer = new Buffer(8);
		field3190 = 0;
		NetCache_crc = new CRC32();
		NetCache_archives = new Archive[256];
		field3207 = 0;
		NetCache_crcMismatches = 0;
		NetCache_ioExceptions = 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		signature = "(ILco;ZI)I",
		garbageValue = "-979858945"
	)
	static int method4461(int var0, Script var1, boolean var2) {
		String var3;
		int var4;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
			var4 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3 + var4;
			return 1;
		} else {
			String var9;
			if (var0 == ScriptOpcodes.APPEND) {
				UrlRequester.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize];
				var9 = Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3 + var9;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3 + class197.intToString(var4, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var10 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
					long var11 = ((long)var10 + 11745L) * 86400000L;
					Interpreter.Interpreter_calendar.setTime(new Date(var11));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var16 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var16] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var10 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = Integer.toString(var10);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						UrlRequester.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = EnumComposition.method4714(DevicePcmPlayerProvider.compareStrings(Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize + 1], FontName.clientLanguage));
						return 1;
					} else {
						int var5;
						byte[] var13;
						Font var14;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
							MilliClock.Interpreter_intStackSize -= 2;
							var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
							var13 = class8.archive13.takeFile(var5, 0);
							var14 = new Font(var13);
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var14.lineCount(var3, var4);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
							MilliClock.Interpreter_intStackSize -= 2;
							var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
							var13 = class8.archive13.takeFile(var5, 0);
							var14 = new Font(var13);
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var14.lineWidth(var3, var4);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							UrlRequester.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var9;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3 + (char)var4;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var10 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = PcmPlayer.isCharPrintable((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = class3.isAlphaNumeric((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var10 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = AbstractWorldMapData.isCharAlphabetic((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = class1.isDigit((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
							MilliClock.Interpreter_intStackSize -= 2;
							var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3.substring(var4, var5);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
							StringBuilder var17 = new StringBuilder(var3.length());
							boolean var15 = false;

							for (var6 = 0; var6 < var3.length(); ++var6) {
								char var7 = var3.charAt(var6);
								if (var7 == '<') {
									var15 = true;
								} else if (var7 == '>') {
									var15 = false;
								} else if (!var15) {
									var17.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var17.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.indexOf(var4);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							UrlRequester.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize + 1];
							var5 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.indexOf(var9, var5);
							return 1;
						} else if (var0 == ScriptOpcodes.UPPERCASE) {
							var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					UrlRequester.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize];
					var9 = Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize + 1];
					if (PlayerType.localPlayer.appearance != null && PlayerType.localPlayer.appearance.isFemale) {
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var9;
					} else {
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}
}
