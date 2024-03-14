import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("aq")
	boolean field1805;
	@ObfuscatedName("aw")
	boolean field1802;
	@ObfuscatedName("al")
	@Export("members")
	public List members;
	@ObfuscatedName("ai")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 9051283318980582005L
	)
	public long field1808;
	@ObfuscatedName("as")
	@Export("name")
	public String name;
	@ObfuscatedName("aa")
	public byte field1806;
	@ObfuscatedName("az")
	public byte field1801;

	static {
		new BitSet(65536); // L: 22
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1802 = true; // L: 13
		this.name = null; // L: 17
		this.method3475(var1); // L: 26
	} // L: 27

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "316467633"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 30
			String[] var1 = new String[this.members.size()]; // L: 31
			this.sortedMembers = new int[this.members.size()]; // L: 32

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 33 35
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method10078(); // L: 34
			}

			class237.method4614(var1, this.sortedMembers); // L: 37
		}

		return this.sortedMembers; // L: 39
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lfe;I)V",
		garbageValue = "1081139077"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 43
		this.sortedMembers = null; // L: 44
	} // L: 45

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1652550545"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 48
		this.sortedMembers = null; // L: 49
	} // L: 50

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-104"
	)
	public int method3481() {
		return this.members.size(); // L: 53
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2146908176"
	)
	public int method3487(String var1) {
		if (!this.field1802) { // L: 57
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1159592870"
	)
	void method3475(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 65
		if ((var2 & 1) != 0) { // L: 66
			this.field1805 = true;
		}

		if ((var2 & 2) != 0) { // L: 67
			this.field1802 = true;
		}

		int var3 = 2; // L: 68
		if ((var2 & 4) != 0) { // L: 69
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 70
		this.field1808 = var1.readLong(); // L: 71
		this.name = var1.readStringCp1252NullTerminated(); // L: 72
		var1.readBoolean(); // L: 73
		this.field1801 = var1.readByte(); // L: 74
		this.field1806 = var1.readByte(); // L: 75
		int var4 = var1.readUnsignedShort(); // L: 76
		if (var4 > 0) { // L: 77
			this.members = new ArrayList(var4); // L: 78

			for (int var5 = 0; var5 < var4; ++var5) { // L: 79
				ClanChannelMember var6 = new ClanChannelMember(); // L: 80
				if (this.field1805) { // L: 81
					var1.readLong(); // L: 82
				}

				if (this.field1802) { // L: 84
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "9"
	)
	public static String method3490(String var0) {
		int var1 = var0.length(); // L: 163
		char[] var2 = new char[var1]; // L: 164
		byte var3 = 2; // L: 165

		for (int var4 = 0; var4 < var1; ++var4) { // L: 166
			char var5 = var0.charAt(var4); // L: 167
			if (var3 == 0) { // L: 168
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 169
				char var6;
				if (var5 != 181 && var5 != 402) { // L: 172
					var6 = Character.toTitleCase(var5); // L: 176
				} else {
					var6 = var5; // L: 173
				}

				var5 = var6; // L: 178
			}

			if (Character.isLetter(var5)) { // L: 180
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 181
				if (Character.isSpaceChar(var5)) { // L: 182
					if (var3 != 2) { // L: 183
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 185
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 186
		}

		return new String(var2); // L: 188
	}
}
