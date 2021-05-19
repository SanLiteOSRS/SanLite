import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class374 implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	public static final class374 field4141;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	public static final class374 field4135;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	public static final class374 field4136;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1912726257
	)
	final int field4139;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1030005029
	)
	public final int field4138;
	@ObfuscatedName("z")
	public final Class field4134;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	final class370 field4137;

	static {
		field4141 = new class374(2, 0, Integer.class, new class371());
		field4135 = new class374(0, 1, Long.class, new class373());
		field4136 = new class374(1, 2, String.class, new class375());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lnt;)V"
	)
	class374(int var1, int var2, Class var3, class370 var4) {
		this.field4139 = var1;
		this.field4138 = var2;
		this.field4134 = var3;
		this.field4137 = var4;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-708237537"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4138;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)Ljava/lang/Object;",
		garbageValue = "-8"
	)
	public Object method6351(Buffer var1) {
		return this.field4137.vmethod6362(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-225266091"
	)
	static int method6359(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnz;",
		garbageValue = "2122701602"
	)
	public static class374[] method6356() {
		return new class374[]{field4141, field4136, field4135};
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lnt;",
		garbageValue = "-1426815547"
	)
	public static class370 method6350(Class var0) {
		class374[] var2 = method6356();
		int var3 = 0;

		class374 var1;
		while (true) {
			if (var3 >= var2.length) {
				var1 = null;
				break;
			}

			class374 var4 = var2[var3];
			if (var4.field4134 == var0) {
				var1 = var4;
				break;
			}

			++var3;
		}

		if (var1 == null) {
			throw new IllegalArgumentException();
		} else {
			return var1.field4137;
		}
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-312092894"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field833 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (HitSplatDefinition.getWindowedMode() == 1) {
			class303.client.setMaxCanvasSize(765, 503);
		} else {
			class303.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25) {
			PacketBufferNode var1 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2655, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(HitSplatDefinition.getWindowedMode());
			var1.packetBuffer.writeShort(GameEngine.canvasWidth);
			var1.packetBuffer.writeShort(HealthBarDefinition.canvasHeight);
			Client.packetWriter.addNode(var1);
		}

	}
}
