import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
public class class5 extends class16 {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1071759603
	)
	static int field53;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -625073017
	)
	int field56;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lx;)V"
	)
	class5(class19 var1) {
		this.this$0 = var1;
		this.field56 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "68071115"
	)
	void vmethod266(Buffer var1) {
		this.field56 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-1846892157"
	)
	void vmethod264(class3 var1) {
		var1.method26(this.field56);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1508723564"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, (long)var5.count);
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IS)[B",
		garbageValue = "3296"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "30"
	)
	public static int method58(int var0) {
		return VarpDefinition.method2630(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "113"
	)
	static final boolean method51(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0];
			if (var1 >= 2000) {
				var1 -= 2000;
			}

			return var1 == 1007;
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1850055815"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) {
			Widget var0 = ModeWhere.getWidgetChild(Decimator.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				PacketWriter.runScriptEvent(var1);
			}

			Client.field788 = -1;
			Client.isSpellSelected = false;
			WorldMapCacheName.invalidateWidget(var0);
		}
	}
}
