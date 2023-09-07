import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("au")
	boolean field1807;
	@ObfuscatedName("ae")
	boolean field1801;
	@ObfuscatedName("ao")
	@Export("members")
	public List members;
	@ObfuscatedName("at")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -1404514629729281795L
	)
	public long field1808;
	@ObfuscatedName("ai")
	@Export("name")
	public String name;
	@ObfuscatedName("az")
	public byte field1800;
	@ObfuscatedName("ap")
	public byte field1804;

	static {
		new BitSet(65536); // L: 22
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Ltm;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1801 = true; // L: 13
		this.name = null; // L: 17
		this.method3315(var1); // L: 26
	} // L: 27

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "74"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method9688();
			}

			int[] var3 = this.sortedMembers; // L: 37
			VerticalAlignment.method3745(var1, var3, 0, var1.length - 1); // L: 39
		}

		return this.sortedMembers; // L: 42
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfu;I)V",
		garbageValue = "2089443829"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 46
		this.sortedMembers = null; // L: 47
	} // L: 48

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-753870503"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 51
		this.sortedMembers = null; // L: 52
	} // L: 53

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "65"
	)
	public int method3301() {
		return this.members.size(); // L: 56
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)I",
		garbageValue = "179"
	)
	public int method3302(String var1) {
		if (!this.field1801) { // L: 60
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "-1748777408"
	)
	void method3315(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 68
		if ((var2 & 1) != 0) { // L: 69
			this.field1807 = true;
		}

		if ((var2 & 2) != 0) { // L: 70
			this.field1801 = true;
		}

		int var3 = 2; // L: 71
		if ((var2 & 4) != 0) { // L: 72
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 73
		this.field1808 = var1.readLong(); // L: 74
		this.name = var1.readStringCp1252NullTerminated(); // L: 75
		var1.readBoolean(); // L: 76
		this.field1804 = var1.readByte(); // L: 77
		this.field1800 = var1.readByte(); // L: 78
		int var4 = var1.readUnsignedShort(); // L: 79
		if (var4 > 0) { // L: 80
			this.members = new ArrayList(var4); // L: 81

			for (int var5 = 0; var5 < var4; ++var5) { // L: 82
				ClanChannelMember var6 = new ClanChannelMember(); // L: 83
				if (this.field1807) { // L: 84
					var1.readLong(); // L: 85
				}

				if (this.field1801) { // L: 87
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lhz;",
		garbageValue = "1042028592"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0); // L: 29
		if (var1 != null) { // L: 30
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0); // L: 31
			var1 = new KitDefinition(); // L: 32
			if (var2 != null) { // L: 33
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0); // L: 34
			return var1; // L: 35
		}
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Lie;S)V",
		garbageValue = "12208"
	)
	static void method3321(class211 var0) {
		if (var0 != null && var0.field2355 != null) { // L: 5154
			if (var0.field2355.childIndex >= 0) { // L: 5155
				Widget var1 = class92.getWidget(var0.field2355.parentId); // L: 5156
				if (var1 == null || var1.children == null || var1.children.length == 0 || var0.field2355.childIndex >= var1.children.length || var0.field2355 != var1.children[var0.field2355.childIndex]) { // L: 5157
					return; // L: 5158
				}
			}

			if (var0.field2355.type == 11 && var0.field2350 == 0) { // L: 5161
				if (var0.field2355.method6404(var0.field2352, var0.field2354, 0, 0)) { // L: 5162
					switch(var0.field2355.method6408()) { // L: 5163
					case 0:
						class30.openURL(var0.field2355.method6410(), true, false); // L: 5165
						break;
					case 1:
						int var2 = class194.getWidgetFlags(var0.field2355); // L: 5169
						boolean var5 = (var2 >> 22 & 1) != 0; // L: 5171
						if (var5) { // L: 5173
							int[] var3 = var0.field2355.method6424(); // L: 5174
							if (var3 != null) { // L: 5175
								PacketBufferNode var4 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3124, Client.packetWriter.isaacCipher); // L: 5176
								var4.packetBuffer.method9111(var3[1]); // L: 5177
								var4.packetBuffer.method9112(var0.field2355.id); // L: 5178
								var4.packetBuffer.method9239(var0.field2355.childIndex); // L: 5179
								var4.packetBuffer.writeInt(var0.field2355.method6409()); // L: 5180
								var4.packetBuffer.method9112(var3[2]); // L: 5181
								var4.packetBuffer.method9112(var3[0]); // L: 5182
								Client.packetWriter.addNode(var4); // L: 5183
							}
						}
					}
				}
			} else if (var0.field2355.type == 12) { // L: 5190
				class329 var6 = var0.field2355.method6532(); // L: 5191
				if (var6 != null && var6.method6158()) { // L: 5192
					switch(var0.field2350) { // L: 5193
					case 0:
						Client.field765.method4093(var0.field2355); // L: 5195
						var6.method6106(true); // L: 5196
						var6.method6347(var0.field2352, var0.field2354, Client.field674.method4120(82), Client.field674.method4120(81)); // L: 5197
						break;
					case 1:
						var6.method6190(var0.field2352, var0.field2354); // L: 5200
					}
				}
			}

		}
	} // L: 5205
}
