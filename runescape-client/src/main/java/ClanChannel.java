import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gh")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("at")
	public static short[][] field1776;
	@ObfuscatedName("aw")
	boolean field1772;
	@ObfuscatedName("ay")
	boolean field1779;
	@ObfuscatedName("ar")
	@Export("members")
	public List members;
	@ObfuscatedName("am")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = -3436089935081817211L
	)
	long field1773;
	@ObfuscatedName("aj")
	@Export("name")
	public String name;
	@ObfuscatedName("ag")
	public byte field1778;
	@ObfuscatedName("az")
	public byte field1780;

	static {
		new BitSet(65536); // L: 22
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Lty;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1779 = true; // L: 13
		this.name = null; // L: 17
		this.method3366(var1); // L: 26
	} // L: 27

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "612198158"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 30
			String[] var1 = new String[this.members.size()]; // L: 31
			this.sortedMembers = new int[this.members.size()]; // L: 32

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 33 35
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method9741(); // L: 34
			}

			int[] var3 = this.sortedMembers; // L: 37
			Actor.method2413(var1, var3, 0, var1.length - 1); // L: 39
		}

		return this.sortedMembers; // L: 42
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfv;I)V",
		garbageValue = "-1094917033"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 46
		this.sortedMembers = null; // L: 47
	} // L: 48

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-35"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 51
		this.sortedMembers = null; // L: 52
	} // L: 53

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1130527405"
	)
	public int method3383() {
		return this.members.size(); // L: 56
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1760330664"
	)
	public int method3370(String var1) {
		if (!this.field1779) { // L: 60
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) { // L: 61
				if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
					return var2; // L: 62
				}
			}

			return -1; // L: 64
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "-404696620"
	)
	void method3366(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 68
		if ((var2 & 1) != 0) { // L: 69
			this.field1772 = true;
		}

		if ((var2 & 2) != 0) { // L: 70
			this.field1779 = true;
		}

		int var3 = 2; // L: 71
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1773 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1780 = var1.readByte();
		this.field1778 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) { // L: 82
				ClanChannelMember var6 = new ClanChannelMember(); // L: 83
				if (this.field1772) {
					var1.readLong(); // L: 85
				}

				if (this.field1779) {
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte();
				var6.world = var1.readUnsignedShort();
				if (var3 >= 3) {
					var1.readBoolean();
				}

				this.members.add(var5, var6);
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "-1273732472"
	)
	public static int method3380(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 72
			boolean var3 = false; // L: 73
			boolean var4 = false; // L: 74
			int var5 = 0; // L: 75
			int var6 = var0.length(); // L: 76

			for (int var7 = 0; var7 < var6; ++var7) { // L: 77
				char var8 = var0.charAt(var7); // L: 78
				if (var7 == 0) { // L: 79
					if (var8 == '-') { // L: 80
						var3 = true; // L: 81
						continue;
					}

					if (var8 == '+') { // L: 84
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 86
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 87
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 88
						throw new NumberFormatException(); // L: 89
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 90
					throw new NumberFormatException();
				}

				if (var3) { // L: 91
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 92
				if (var9 / var1 != var5) { // L: 93
					throw new NumberFormatException();
				}

				var5 = var9; // L: 94
				var4 = true; // L: 95
			}

			if (!var4) { // L: 97
				throw new NumberFormatException();
			} else {
				return var5; // L: 98
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1607234368"
	)
	static int method3381(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1819
			var3 = VarbitComposition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1820
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId; // L: 1821
			return 1; // L: 1822
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1824
			var3 = VarbitComposition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1825
			if (var3.itemId != -1) { // L: 1826
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1827
			}

			return 1; // L: 1828
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1830
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1831
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5); // L: 1832
			if (var4 != null) { // L: 1833
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1834
			}

			return 1; // L: 1835
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1837
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1838
			return 1; // L: 1839
		} else if (var0 == 2707) { // L: 1841
			var3 = VarbitComposition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1842
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6459() ? 1 : 0; // L: 1843
			return 1; // L: 1844
		} else if (var0 == 2708) { // L: 1846
			var3 = VarbitComposition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1847
			return class74.method2089(var3); // L: 1848
		} else if (var0 == 2709) { // L: 1850
			var3 = VarbitComposition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1851
			return class133.method3040(var3); // L: 1852
		} else {
			return 2; // L: 1854
		}
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1686824610"
	)
	static int method3388() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1463
			int var0 = 0; // L: 1464

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1465
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1466
			}

			return var0 * 10000 / Client.field814; // L: 1468
		} else {
			return 10000;
		}
	}
}
