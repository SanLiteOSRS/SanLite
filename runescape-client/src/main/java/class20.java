import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
public class class20 extends class16 {
	@ObfuscatedName("ru")
	@ObfuscatedGetter(
		intValue = -114026065
	)
	static int field166;
	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "[Loa;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 468630141
	)
	int field162;
	@ObfuscatedName("e")
	byte field163;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 658289705
	)
	int field161;
	@ObfuscatedName("y")
	String field164;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ls;)V"
	)
	class20(class19 var1) {
		this.this$0 = var1;
		this.field162 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "851460888"
	)
	void vmethod331(Buffer var1) {
		this.field162 = var1.readUnsignedShort();
		this.field163 = var1.readByte();
		this.field161 = var1.readUnsignedShort();
		var1.readLong();
		this.field164 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-1362614343"
	)
	void vmethod332(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field162);
		var2.rank = this.field163;
		var2.world = this.field161;
		var2.name = this.field164;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "-8931"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (Widget.Widget_loadedInterfaces[var0]) {
			return true;
		} else if (!AttackOption.Widget_archive.tryLoadGroup(var0)) {
			return false;
		} else {
			int var1 = AttackOption.Widget_archive.getGroupFileCount(var0);
			if (var1 == 0) {
				Widget.Widget_loadedInterfaces[var0] = true;
				return true;
			} else {
				if (GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0] == null) {
					GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) {
					if (GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0][var2] == null) {
						byte[] var3 = AttackOption.Widget_archive.takeFile(var0, var2);
						if (var3 != null) {
							GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0][var2] = new Widget();
							GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
							if (var3[0] == -1) {
								GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
							}
						}
					}
				}

				Widget.Widget_loadedInterfaces[var0] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-11"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) {
			Widget var0 = class17.getWidgetChild(class15.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				WorldMapSection1.runScriptEvent(var1);
			}

			Client.field634 = -1;
			Client.isSpellSelected = false;
			Script.invalidateWidget(var0);
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1886471303"
	)
	static final void method288() {
		PacketBufferNode var0 = InterfaceParent.getPacketBufferNode(ClientPacket.field2593, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				InvDefinition.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			Script.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

	}
}
