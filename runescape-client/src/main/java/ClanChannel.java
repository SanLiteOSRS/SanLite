import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("gd")
	static String field1765;
	@ObfuscatedName("un")
	@ObfuscatedGetter(
		intValue = -1954646921
	)
	static int field1766;
	@ObfuscatedName("am")
	boolean field1769;
	@ObfuscatedName("ap")
	boolean field1759;
	@ObfuscatedName("af")
	@Export("members")
	public List members;
	@ObfuscatedName("aj")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -815507630431894567L
	)
	public long field1764;
	@ObfuscatedName("ar")
	@Export("name")
	public String name;
	@ObfuscatedName("ag")
	public byte field1758;
	@ObfuscatedName("ao")
	public byte field1767;

	static {
		new BitSet(65536); // L: 22
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Luk;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1759 = true; // L: 13
		this.name = null; // L: 17
		this.method3493(var1); // L: 26
	} // L: 27

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1506851312"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 30
			String[] var1 = new String[this.members.size()]; // L: 31
			this.sortedMembers = new int[this.members.size()]; // L: 32

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 33 35
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method10004(); // L: 34
			}

			int[] var3 = this.sortedMembers; // L: 37
			Player.method2422(var1, var3, 0, var1.length - 1); // L: 39
		}

		return this.sortedMembers; // L: 42
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfk;I)V",
		garbageValue = "545474341"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 46
		this.sortedMembers = null; // L: 47
	} // L: 48

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-365947513"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 51
		this.sortedMembers = null; // L: 52
	} // L: 53

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "347397534"
	)
	public int method3492() {
		return this.members.size(); // L: 56
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "117"
	)
	public int method3495(String var1) {
		if (!this.field1759) { // L: 60
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "1944473885"
	)
	void method3493(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 68
		if ((var2 & 1) != 0) { // L: 69
			this.field1769 = true;
		}

		if ((var2 & 2) != 0) { // L: 70
			this.field1759 = true;
		}

		int var3 = 2; // L: 71
		if ((var2 & 4) != 0) { // L: 72
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 73
		this.field1764 = var1.readLong(); // L: 74
		this.name = var1.readStringCp1252NullTerminated(); // L: 75
		var1.readBoolean(); // L: 76
		this.field1767 = var1.readByte(); // L: 77
		this.field1758 = var1.readByte(); // L: 78
		int var4 = var1.readUnsignedShort(); // L: 79
		if (var4 > 0) { // L: 80
			this.members = new ArrayList(var4); // L: 81

			for (int var5 = 0; var5 < var4; ++var5) { // L: 82
				ClanChannelMember var6 = new ClanChannelMember(); // L: 83
				if (this.field1769) { // L: 84
					var1.readLong(); // L: 85
				}

				if (this.field1759) { // L: 87
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte(); // L: 88
				var6.world = var1.readUnsignedShort(); // L: 89
				if (var3 >= 3) { // L: 90
					var1.readBoolean(); // L: 91
				}

				this.members.add(var5, var6); // L: 94
			}
		}

	} // L: 97
}
