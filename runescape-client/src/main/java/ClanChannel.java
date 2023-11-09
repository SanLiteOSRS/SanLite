import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = 1655091029
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = 2009090259
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("h")
	boolean field1801;
	@ObfuscatedName("e")
	boolean field1791;
	@ObfuscatedName("v")
	@Export("members")
	public List members;
	@ObfuscatedName("x")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = -3180460269199447763L
	)
	long field1794;
	@ObfuscatedName("q")
	@Export("name")
	public String name;
	@ObfuscatedName("f")
	public byte field1796;
	@ObfuscatedName("r")
	public byte field1799;

	static {
		new BitSet(65536); // L: 22
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Lqy;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1791 = true; // L: 13
		this.name = null; // L: 17
		this.method3314(var1); // L: 26
	} // L: 27

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1521514395"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 30
			String[] var1 = new String[this.members.size()]; // L: 31
			this.sortedMembers = new int[this.members.size()]; // L: 32

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 33 35
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method9160(); // L: 34
			}

			ItemContainer.method2237(var1, this.sortedMembers); // L: 37
		}

		return this.sortedMembers; // L: 39
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lee;I)V",
		garbageValue = "-2049218043"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 43
		this.sortedMembers = null; // L: 44
	} // L: 45

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1798196264"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 48
		this.sortedMembers = null; // L: 49
	} // L: 50

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-825544108"
	)
	public int method3312() {
		return this.members.size(); // L: 53
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "939290136"
	)
	public int method3313(String var1) {
		if (!this.field1791) { // L: 57
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)V",
		garbageValue = "-112"
	)
	void method3314(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 65
		if ((var2 & 1) != 0) { // L: 66
			this.field1801 = true;
		}

		if ((var2 & 2) != 0) { // L: 67
			this.field1791 = true;
		}

		int var3 = 2; // L: 68
		if ((var2 & 4) != 0) { // L: 69
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 70
		this.field1794 = var1.readLong(); // L: 71
		this.name = var1.readStringCp1252NullTerminated(); // L: 72
		var1.readBoolean(); // L: 73
		this.field1799 = var1.readByte(); // L: 74
		this.field1796 = var1.readByte(); // L: 75
		int var4 = var1.readUnsignedShort(); // L: 76
		if (var4 > 0) { // L: 77
			this.members = new ArrayList(var4); // L: 78

			for (int var5 = 0; var5 < var4; ++var5) { // L: 79
				ClanChannelMember var6 = new ClanChannelMember(); // L: 80
				if (this.field1801) { // L: 81
					var1.readLong(); // L: 82
				}

				if (this.field1791) { // L: 84
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
}
