import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("aj")
	boolean field1760;
	@ObfuscatedName("al")
	boolean field1754;
	@ObfuscatedName("ac")
	@Export("members")
	public List members;
	@ObfuscatedName("ab")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -2874155691746172939L
	)
	long field1757;
	@ObfuscatedName("ao")
	@Export("name")
	public String name;
	@ObfuscatedName("av")
	public byte field1758;
	@ObfuscatedName("aq")
	public byte field1761;

	static {
		new BitSet(65536);
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Lsy;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1754 = true; // L: 13
		this.name = null; // L: 17
		this.method3330(var1); // L: 26
	} // L: 27

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1448709705"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 30
			String[] var1 = new String[this.members.size()]; // L: 31
			this.sortedMembers = new int[this.members.size()]; // L: 32

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 33 35
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method9223(); // L: 34
			}

			Canvas.method315(var1, this.sortedMembers); // L: 37
		}

		return this.sortedMembers; // L: 39
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfy;I)V",
		garbageValue = "1948006287"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 43
		this.sortedMembers = null; // L: 44
	} // L: 45

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-661821909"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 48
		this.sortedMembers = null; // L: 49
	} // L: 50

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "69"
	)
	public int method3329() {
		return this.members.size(); // L: 53
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)I",
		garbageValue = "179"
	)
	public int method3337(String var1) {
		if (!this.field1754) { // L: 57
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
		descriptor = "(Lsy;I)V",
		garbageValue = "1790413390"
	)
	void method3330(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 65
		if ((var2 & 1) != 0) { // L: 66
			this.field1760 = true;
		}

		if ((var2 & 2) != 0) { // L: 67
			this.field1754 = true;
		}

		int var3 = 2; // L: 68
		if ((var2 & 4) != 0) { // L: 69
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 70
		this.field1757 = var1.readLong(); // L: 71
		this.name = var1.readStringCp1252NullTerminated(); // L: 72
		var1.readBoolean(); // L: 73
		this.field1761 = var1.readByte(); // L: 74
		this.field1758 = var1.readByte(); // L: 75
		int var4 = var1.readUnsignedShort(); // L: 76
		if (var4 > 0) { // L: 77
			this.members = new ArrayList(var4); // L: 78

			for (int var5 = 0; var5 < var4; ++var5) { // L: 79
				ClanChannelMember var6 = new ClanChannelMember(); // L: 80
				if (this.field1760) { // L: 81
					var1.readLong(); // L: 82
				}

				if (this.field1754) { // L: 84
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsy;Ljava/lang/String;I)I",
		garbageValue = "1827188191"
	)
	public static int method3325(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 18
		byte[] var3 = WorldMapSection0.method5168(var1); // L: 19
		var0.writeSmartByteShort(var3.length); // L: 20
		var0.offset += class315.huffman.compress(var3, 0, var3.length, var0.array, var0.offset); // L: 21
		return var0.offset - var2; // L: 22
	}
}
