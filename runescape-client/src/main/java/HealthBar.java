import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("rt")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque();
		this.definition = var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "0"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null;
		int var6 = 0;

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) {
			++var6;
			if (var7.cycle == var1) {
				var7.set(var1, var2, var3, var4);
				return;
			}

			if (var7.cycle <= var1) {
				var5 = var7;
			}
		}

		if (var5 == null) {
			if (var6 < 4) {
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
			if (var6 >= 4) {
				this.updates.last().remove();
			}

		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Lcd;",
		garbageValue = "655971331"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last();
		if (var2 != null && var2.cycle <= var1) {
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) {
				var2.remove();
				var2 = var3;
			}

			if (this.definition.int5 + var2.cycle + var2.cycleOffset > var1) {
				return var2;
			} else {
				var2.remove();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1027939055"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method5633();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "45"
	)
	static void method2242() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZS)Ljava/lang/String;",
		garbageValue = "-17378"
	)
	static String method2246(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (UserComparator3.field1316 != null) {
			var3 = "/p=" + UserComparator3.field1316;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + MouseHandler.clientLanguage + "/a=" + TextureProvider.field2483 + var3 + "/";
	}
}
