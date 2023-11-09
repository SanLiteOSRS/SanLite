import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
public class class7 {
	@ObfuscatedName("at")
	ExecutorService field20;
	@ObfuscatedName("an")
	Future field21;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	final Buffer field19;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	final class3 field22;

	@ObfuscatedSignature(
		descriptor = "(Ltz;Las;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field20 = Executors.newSingleThreadExecutor(); // L: 10
		this.field19 = var1; // L: 16
		this.field22 = var2; // L: 17
		this.method41(); // L: 18
	} // L: 19

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "443618027"
	)
	public boolean method37() {
		return this.field21.isDone(); // L: 22
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1008705538"
	)
	public void method50() {
		this.field20.shutdown(); // L: 26
		this.field20 = null; // L: 27
	} // L: 28

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ltz;",
		garbageValue = "-1569723442"
	)
	public Buffer method40() {
		try {
			return (Buffer)this.field21.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-28030"
	)
	void method41() {
		this.field21 = this.field20.submit(new class1(this, this.field19, this.field22)); // L: 40
	} // L: 41

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "557899842"
	)
	static char method52(char var0) {
		switch(var0) { // L: 72
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_'; // L: 77
		case '#':
		case '[':
		case ']':
			return var0; // L: 93
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a'; // L: 141
		case 'Ç':
		case 'ç':
			return 'c'; // L: 103
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e'; // L: 117
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i'; // L: 100
		case 'Ñ':
		case 'ñ':
			return 'n'; // L: 108
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o'; // L: 130
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u'; // L: 89
		case 'ß':
			return 'b'; // L: 119
		case 'ÿ':
		case 'Ÿ':
			return 'y'; // L: 80
		default:
			return Character.toLowerCase(var0); // L: 105
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-111"
	)
	static final void method51(String var0) {
		PacketBufferNode var1 = ObjectComposition.getPacketBufferNode(ClientPacket.field3111, Client.packetWriter.isaacCipher); // L: 179
		var1.packetBuffer.writeByte(Widget.stringCp1252NullTerminatedByteSize(var0)); // L: 180
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 181
		Client.packetWriter.addNode(var1); // L: 182
	} // L: 183

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-541537538"
	)
	static final void method44() {
		int var0 = class180.menuX; // L: 9111
		int var1 = class193.menuY; // L: 9112
		int var2 = class237.menuWidth; // L: 9113
		int var3 = class60.menuHeight; // L: 9114
		int var4 = 6116423; // L: 9115
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4); // L: 9116
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0); // L: 9117
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0); // L: 9118
		class166.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1); // L: 9119
		int var5 = MouseHandler.MouseHandler_x; // L: 9120
		int var6 = MouseHandler.MouseHandler_y; // L: 9121

		int var7;
		int var8;
		int var9;
		for (var7 = 0; var7 < Client.menuOptionsCount; ++var7) { // L: 9122
			var8 = var1 + (Client.menuOptionsCount - 1 - var7) * 15 + 31; // L: 9123
			var9 = 16777215; // L: 9124
			if (var5 > var0 && var5 < var2 + var0 && var6 > var8 - 13 && var6 < var8 + 3) { // L: 9125
				var9 = 16776960;
			}

			Font var12 = class166.fontBold12; // L: 9126
			String var13;
			if (var7 < 0) { // L: 9129
				var13 = ""; // L: 9130
			} else if (Client.menuTargets[var7].length() > 0) { // L: 9133
				var13 = Client.menuActions[var7] + " " + Client.menuTargets[var7];
			} else {
				var13 = Client.menuActions[var7]; // L: 9134
			}

			var12.draw(var13, var0 + 3, var8, var9, 0); // L: 9136
		}

		var7 = class180.menuX; // L: 9138
		var8 = class193.menuY; // L: 9139
		var9 = class237.menuWidth; // L: 9140
		int var10 = class60.menuHeight; // L: 9141

		for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 9143
			if (Client.rootWidgetWidths[var11] + Client.rootWidgetXs[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var10 + var8) { // L: 9144
				Client.field724[var11] = true;
			}
		}

	} // L: 9147

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1677894938"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 12569
			PacketBufferNode var1 = ObjectComposition.getPacketBufferNode(ClientPacket.field3128, Client.packetWriter.isaacCipher); // L: 12571
			var1.packetBuffer.writeByte(Widget.stringCp1252NullTerminatedByteSize(var0)); // L: 12572
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12573
			Client.packetWriter.addNode(var1); // L: 12574
		}
	} // L: 12575
}
