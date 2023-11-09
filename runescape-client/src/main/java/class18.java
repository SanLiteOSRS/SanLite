import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
class class18 implements Comparator {
	@ObfuscatedName("tb")
	@ObfuscatedGetter(
		intValue = -389618459
	)
	static int field96;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ld;"
	)
	final class10 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ld;)V"
	)
	class18(class10 var1) {
		this.this$0 = var1; // L: 42
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
		garbageValue = "-1460972605"
	)
	int method253(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue()); // L: 44
	}

	public int compare(Object var1, Object var2) {
		return this.method253((Entry)var1, (Entry)var2); // L: 48
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 52
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILku;ZI)V",
		garbageValue = "1859410588"
	)
	static void method264(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class65.getWorldMap().getMapArea(var0); // L: 5006
		int var4 = ScriptFrame.localPlayer.plane; // L: 5007
		int var5 = Decimator.baseX * 64 + (ScriptFrame.localPlayer.x >> 7); // L: 5008
		int var6 = class7.baseY * 64 + (ScriptFrame.localPlayer.y >> 7); // L: 5009
		Coord var7 = new Coord(var4, var5, var6); // L: 5010
		class65.getWorldMap().method7279(var3, var7, var1, var2); // L: 5011
	} // L: 5012

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)Z",
		garbageValue = "-2080011839"
	)
	static final boolean method263(Widget var0) {
		int var1 = var0.contentType; // L: 11805
		if (var1 == 205) { // L: 11806
			Client.logoutTimer = 250; // L: 11807
			return true; // L: 11808
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 11810
				var2 = (var1 - 300) / 2; // L: 11811
				var3 = var1 & 1; // L: 11812
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 11813
			}

			if (var1 >= 314 && var1 <= 323) { // L: 11815
				var2 = (var1 - 314) / 2; // L: 11816
				var3 = var1 & 1; // L: 11817
				Client.playerAppearance.method5497(var2, var3 == 1); // L: 11818
			}

			if (var1 == 324) {
				Client.playerAppearance.changeSex(false); // L: 11820
			}

			if (var1 == 325) { // L: 11821
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) { // L: 11822
				PacketBufferNode var4 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2932, Client.packetWriter.isaacCipher); // L: 11824
				Client.playerAppearance.write(var4.packetBuffer); // L: 11825
				Client.packetWriter.addNode(var4); // L: 11826
				return true; // L: 11827
			} else {
				return false; // L: 11829
			}
		}
	}
}
