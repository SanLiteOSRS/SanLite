import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = 1667612672
	)
	static int field1664;
	@ObfuscatedName("s")
	boolean field1665;
	@ObfuscatedName("h")
	boolean field1663;
	@ObfuscatedName("w")
	@Export("members")
	public List members;
	@ObfuscatedName("v")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 7243300474328225169L
	)
	long field1670;
	@ObfuscatedName("q")
	@Export("name")
	public String name;
	@ObfuscatedName("i")
	public byte field1666;
	@ObfuscatedName("k")
	public byte field1669;

	static {
		new BitSet(65536); // L: 22
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Lqr;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1663 = true; // L: 13
		this.name = null; // L: 17
		this.method3048(var1); // L: 26
	} // L: 27

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-72"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 30
			String[] var1 = new String[this.members.size()]; // L: 31
			this.sortedMembers = new int[this.members.size()]; // L: 32

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 33 35
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method8215(); // L: 34
			}

			int[] var3 = this.sortedMembers; // L: 37
			PlayerType.method5694(var1, var3, 0, var1.length - 1); // L: 39
		}

		return this.sortedMembers; // L: 42
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lev;I)V",
		garbageValue = "1546558126"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 46
		this.sortedMembers = null; // L: 47
	} // L: 48

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "20"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 51
		this.sortedMembers = null; // L: 52
	} // L: 53

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1784780818"
	)
	public int method3046() {
		return this.members.size(); // L: 56
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1079604256"
	)
	public int method3056(String var1) {
		if (!this.field1663) { // L: 60
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "1"
	)
	void method3048(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 68
		if ((var2 & 1) != 0) { // L: 69
			this.field1665 = true;
		}

		if ((var2 & 2) != 0) { // L: 70
			this.field1663 = true;
		}

		int var3 = 2; // L: 71
		if ((var2 & 4) != 0) { // L: 72
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 73
		this.field1670 = var1.readLong(); // L: 74
		this.name = var1.readStringCp1252NullTerminated(); // L: 75
		var1.readBoolean(); // L: 76
		this.field1669 = var1.readByte(); // L: 77
		this.field1666 = var1.readByte(); // L: 78
		int var4 = var1.readUnsignedShort(); // L: 79
		if (var4 > 0) { // L: 80
			this.members = new ArrayList(var4); // L: 81

			for (int var5 = 0; var5 < var4; ++var5) { // L: 82
				ClanChannelMember var6 = new ClanChannelMember(); // L: 83
				if (this.field1665) { // L: 84
					var1.readLong(); // L: 85
				}

				if (this.field1663) { // L: 87
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
