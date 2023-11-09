import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;
	@ObfuscatedName("o")
	boolean field1677;
	@ObfuscatedName("q")
	boolean field1670;
	@ObfuscatedName("f")
	@Export("members")
	public List members;
	@ObfuscatedName("u")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 4338856291735042253L
	)
	long field1674;
	@ObfuscatedName("w")
	@Export("name")
	public String name;
	@ObfuscatedName("z")
	public byte field1676;
	@ObfuscatedName("j")
	public byte field1672;

	static {
		new BitSet(65536); // L: 22
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Lqw;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1670 = true; // L: 13
		this.name = null; // L: 17
		this.method3116(var1); // L: 26
	} // L: 27

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "208587347"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 30
			String[] var1 = new String[this.members.size()]; // L: 31
			this.sortedMembers = new int[this.members.size()]; // L: 32

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 33 35
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method8350(); // L: 34
			}

			class390.method7091(var1, this.sortedMembers); // L: 37
		}

		return this.sortedMembers; // L: 39
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lem;I)V",
		garbageValue = "-1948458277"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 43
		this.sortedMembers = null; // L: 44
	} // L: 45

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-188716261"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 48
		this.sortedMembers = null; // L: 49
	} // L: 50

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2019373406"
	)
	public int method3117() {
		return this.members.size(); // L: 53
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "184146921"
	)
	public int method3119(String var1) {
		if (!this.field1670) { // L: 57
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-1731906570"
	)
	void method3116(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 65
		if ((var2 & 1) != 0) { // L: 66
			this.field1677 = true;
		}

		if ((var2 & 2) != 0) { // L: 67
			this.field1670 = true;
		}

		int var3 = 2; // L: 68
		if ((var2 & 4) != 0) { // L: 69
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 70
		this.field1674 = var1.readLong(); // L: 71
		this.name = var1.readStringCp1252NullTerminated(); // L: 72
		var1.readBoolean(); // L: 73
		this.field1672 = var1.readByte(); // L: 74
		this.field1676 = var1.readByte(); // L: 75
		int var4 = var1.readUnsignedShort(); // L: 76
		if (var4 > 0) { // L: 77
			this.members = new ArrayList(var4); // L: 78

			for (int var5 = 0; var5 < var4; ++var5) { // L: 79
				ClanChannelMember var6 = new ClanChannelMember(); // L: 80
				if (this.field1677) { // L: 81
					var1.readLong(); // L: 82
				}

				if (this.field1670) { // L: 84
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
