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
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	static IndexedSprite field1779;
	@ObfuscatedName("ac")
	boolean field1773;
	@ObfuscatedName("al")
	boolean field1772;
	@ObfuscatedName("ak")
	@Export("members")
	public List members;
	@ObfuscatedName("ax")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -2657131668155479195L
	)
	public long field1775;
	@ObfuscatedName("ah")
	@Export("name")
	public String name;
	@ObfuscatedName("ar")
	public byte field1777;
	@ObfuscatedName("ab")
	public byte field1778;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lul;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1772 = true; // L: 13
		this.name = null; // L: 17
		this.method3388(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-35"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 30
			String[] var1 = new String[this.members.size()]; // L: 31
			this.sortedMembers = new int[this.members.size()]; // L: 32

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 33 35
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method9844(); // L: 34
			}

			int[] var3 = this.sortedMembers; // L: 37
			class161.method3349(var1, var3, 0, var1.length - 1); // L: 39
		}

		return this.sortedMembers; // L: 42
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfv;B)V",
		garbageValue = "0"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 46
		this.sortedMembers = null; // L: 47
	} // L: 48

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-32"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 51
		this.sortedMembers = null; // L: 52
	} // L: 53

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1630727140"
	)
	public int method3382() {
		return this.members.size(); // L: 56
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1421976889"
	)
	public int method3383(String var1) {
		if (!this.field1772) { // L: 60
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "446907071"
	)
	void method3388(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 68
		if ((var2 & 1) != 0) { // L: 69
			this.field1773 = true;
		}

		if ((var2 & 2) != 0) { // L: 70
			this.field1772 = true;
		}

		int var3 = 2; // L: 71
		if ((var2 & 4) != 0) { // L: 72
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 73
		this.field1775 = var1.readLong(); // L: 74
		this.name = var1.readStringCp1252NullTerminated(); // L: 75
		var1.readBoolean(); // L: 76
		this.field1778 = var1.readByte(); // L: 77
		this.field1777 = var1.readByte(); // L: 78
		int var4 = var1.readUnsignedShort(); // L: 79
		if (var4 > 0) { // L: 80
			this.members = new ArrayList(var4); // L: 81

			for (int var5 = 0; var5 < var4; ++var5) { // L: 82
				ClanChannelMember var6 = new ClanChannelMember(); // L: 83
				if (this.field1773) { // L: 84
					var1.readLong(); // L: 85
				}

				if (this.field1772) { // L: 87
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhm;",
		garbageValue = "77"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0); // L: 23
			var1 = new InvDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lde;",
		garbageValue = "203333818"
	)
	static final InterfaceParent method3396(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 12393
		var3.group = var1; // L: 12394
		var3.type = var2; // L: 12395
		Client.interfaceParents.put(var3, (long)var0); // L: 12396
		class357.method6796(var1); // L: 12397
		Widget var4 = class33.field184.method6240(var0); // L: 12398
		ClanChannelMember.invalidateWidget(var4); // L: 12399
		if (Client.meslayerContinueWidget != null) { // L: 12400
			ClanChannelMember.invalidateWidget(Client.meslayerContinueWidget); // L: 12401
			Client.meslayerContinueWidget = null; // L: 12402
		}

		PendingSpawn.revalidateWidgetScroll(class33.field184.field3587[var0 >> 16], var4, false); // L: 12404
		VerticalAlignment.method3845(var1); // L: 12405
		if (Client.rootInterface != -1) { // L: 12406
			Interpreter.method2071(Client.rootInterface, 1);
		}

		return var3; // L: 12407
	}
}
