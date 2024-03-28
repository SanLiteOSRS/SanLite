import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gi")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("az")
	boolean field1803;
	@ObfuscatedName("ah")
	boolean field1796;
	@ObfuscatedName("af")
	@Export("members")
	public List members;
	@ObfuscatedName("at")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = 5206037424797977369L
	)
	public long field1795;
	@ObfuscatedName("ao")
	@Export("name")
	public String name;
	@ObfuscatedName("ab")
	public byte field1801;
	@ObfuscatedName("aw")
	public byte field1799;

	static {
		new BitSet(65536); // L: 22
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Lur;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1796 = true; // L: 13
		this.name = null; // L: 17
		this.method3396(var1); // L: 26
	} // L: 27

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1751960152"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 30
			String[] var1 = new String[this.members.size()]; // L: 31
			this.sortedMembers = new int[this.members.size()]; // L: 32

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 33 35
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method9893(); // L: 34
			}

			class522.method9132(var1, this.sortedMembers); // L: 37
		}

		return this.sortedMembers; // L: 39
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfr;B)V",
		garbageValue = "-41"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 43
		this.sortedMembers = null; // L: 44
	} // L: 45

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-45"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 48
		this.sortedMembers = null; // L: 49
	} // L: 50

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-34"
	)
	public int method3394() {
		return this.members.size(); // L: 53
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "880686013"
	)
	public int method3383(String var1) {
		if (!this.field1796) { // L: 57
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) { // L: 58
				if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
					return var2; // L: 59
				}
			}

			return -1; // L: 61
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "-70"
	)
	void method3396(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 65
		if ((var2 & 1) != 0) { // L: 66
			this.field1803 = true;
		}

		if ((var2 & 2) != 0) { // L: 67
			this.field1796 = true;
		}

		int var3 = 2; // L: 68
		if ((var2 & 4) != 0) { // L: 69
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 70
		this.field1795 = var1.readLong(); // L: 71
		this.name = var1.readStringCp1252NullTerminated(); // L: 72
		var1.readBoolean(); // L: 73
		this.field1799 = var1.readByte(); // L: 74
		this.field1801 = var1.readByte(); // L: 75
		int var4 = var1.readUnsignedShort(); // L: 76
		if (var4 > 0) { // L: 77
			this.members = new ArrayList(var4); // L: 78

			for (int var5 = 0; var5 < var4; ++var5) { // L: 79
				ClanChannelMember var6 = new ClanChannelMember(); // L: 80
				if (this.field1803) { // L: 81
					var1.readLong(); // L: 82
				}

				if (this.field1796) { // L: 84
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte(); // L: 85
				var6.world = var1.readUnsignedShort(); // L: 86
				if (var3 >= 3) { // L: 87
					var1.readBoolean(); // L: 88
				}

				this.members.add(var5, var6); // L: 91
			}
		}

	} // L: 94

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)[B",
		garbageValue = "1593550106"
	)
	static byte[] method3399(String var0) {
		boolean var1 = true; // L: 127
		boolean var2 = true; // L: 128
		int var3 = "pattern".length(); // L: 129
		int var4 = 0; // L: 130
		byte[] var5 = new byte[8]; // L: 131

		while (true) {
			int var6 = var4 + var3; // L: 133
			if (var6 >= var0.length()) { // L: 134
				return null; // L: 135
			}

			char var7 = var0.charAt(var6); // L: 137
			if (var7 == ':') { // L: 138
				if (var4 == 0) { // L: 155
					return null; // L: 156
				}

				byte[] var8 = new byte[var4]; // L: 158
				System.arraycopy(var5, 0, var8, 0, var4); // L: 159
				return var8; // L: 160
			}

			if (var5.length == var4) { // L: 141
				return null; // L: 142
			}

			if (var7 >= '0' && var7 <= '9') { // L: 144
				var7 = (char)(var7 - '0'); // L: 145
			} else {
				if (var7 < 'a' || var7 > 'z') { // L: 147
					return null; // L: 151
				}

				var7 = (char)(var7 - 'W'); // L: 148
			}

			var5[var4++] = (byte)var7; // L: 153
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Ltz;",
		garbageValue = "113"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat"); // L: 265
		if (var3.exists()) { // L: 266
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 268
				return var10; // L: 269
			} catch (IOException var9) { // L: 271
			}
		}

		String var4 = ""; // L: 273
		if (class409.cacheGamebuild == 33) { // L: 274
			var4 = "_rc";
		} else if (class409.cacheGamebuild == 34) { // L: 275
			var4 = "_wip";
		}

		File var5 = new File(class136.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 276
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 277
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 279
				return var6; // L: 280
			} catch (IOException var8) { // L: 282
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 285
			return var6; // L: 286
		} catch (IOException var7) { // L: 288
			throw new RuntimeException(); // L: 289
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "371703173"
	)
	static int method3397(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 4404
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class36.getWindowedMode(); // L: 4405
			return 1; // L: 4406
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 4408
				var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4409
				if (var3 == 1 || var3 == 2) { // L: 4410
					MouseRecorder.setWindowedMode(var3);
				}

				return 1; // L: 4411
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 4413
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = NPC.clientPreferences.method2560(); // L: 4414
				return 1; // L: 4415
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 4417
				if (var0 == 5310) { // L: 4424
					--class19.Interpreter_intStackSize; // L: 4425
					return 1; // L: 4426
				} else {
					return 2; // L: 4428
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4418
				if (var3 == 1 || var3 == 2) { // L: 4419
					NPC.clientPreferences.method2480(var3); // L: 4420
				}

				return 1; // L: 4422
			}
		}
	}
}
