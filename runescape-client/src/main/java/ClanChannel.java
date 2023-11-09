import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("ai")
	boolean field1784;
	@ObfuscatedName("aj")
	boolean field1781;
	@ObfuscatedName("ac")
	@Export("members")
	public List members;
	@ObfuscatedName("aw")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 6347414992727938369L
	)
	long field1782;
	@ObfuscatedName("ap")
	@Export("name")
	public String name;
	@ObfuscatedName("av")
	public byte field1787;
	@ObfuscatedName("an")
	public byte field1780;

	static {
		new BitSet(65536); // L: 22
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Ltl;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1781 = true; // L: 13
		this.name = null; // L: 17
		this.method3425(var1); // L: 26
	} // L: 27

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "882690726"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 30
			String[] var1 = new String[this.members.size()]; // L: 31
			this.sortedMembers = new int[this.members.size()]; // L: 32

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 33 35
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method9701(); // L: 34
			}

			int[] var3 = this.sortedMembers; // L: 37
			FriendsChatMember.method7893(var1, var3, 0, var1.length - 1); // L: 39
		}

		return this.sortedMembers; // L: 42
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfx;I)V",
		garbageValue = "-528520502"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 46
		this.sortedMembers = null; // L: 47
	} // L: 48

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "711232193"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 51
		this.sortedMembers = null; // L: 52
	} // L: 53

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-563562179"
	)
	public int method3423() {
		return this.members.size(); // L: 56
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "790303481"
	)
	public int method3424(String var1) {
		if (!this.field1781) { // L: 60
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "1806196250"
	)
	void method3425(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 68
		if ((var2 & 1) != 0) { // L: 69
			this.field1784 = true;
		}

		if ((var2 & 2) != 0) { // L: 70
			this.field1781 = true;
		}

		int var3 = 2; // L: 71
		if ((var2 & 4) != 0) { // L: 72
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 73
		this.field1782 = var1.readLong(); // L: 74
		this.name = var1.readStringCp1252NullTerminated(); // L: 75
		var1.readBoolean(); // L: 76
		this.field1780 = var1.readByte(); // L: 77
		this.field1787 = var1.readByte(); // L: 78
		int var4 = var1.readUnsignedShort(); // L: 79
		if (var4 > 0) { // L: 80
			this.members = new ArrayList(var4); // L: 81

			for (int var5 = 0; var5 < var4; ++var5) { // L: 82
				ClanChannelMember var6 = new ClanChannelMember(); // L: 83
				if (this.field1784) { // L: 84
					var1.readLong(); // L: 85
				}

				if (this.field1781) { // L: 87
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
