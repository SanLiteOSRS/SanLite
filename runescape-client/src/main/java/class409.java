import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
public class class409 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	public static final class409 field4445;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	public static final class409 field4442;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	public static final class409 field4449;
	@ObfuscatedName("x")
	@Export("userHomeDirectory")
	public static String userHomeDirectory;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1710692843
	)
	final int field4444;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -399344135
	)
	public final int field4452;
	@ObfuscatedName("s")
	public final Class field4446;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	final class405 field4447;

	static {
		field4445 = new class409(1, 0, Integer.class, new class406());
		field4442 = new class409(0, 1, Long.class, new class408());
		field4449 = new class409(2, 2, String.class, new class410());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Loq;)V"
	)
	class409(int var1, int var2, Class var3, class405 var4) {
		this.field4444 = var1;
		this.field4452 = var2;
		this.field4446 = var3;
		this.field4447 = var4;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4452;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)Ljava/lang/Object;",
		garbageValue = "2103066470"
	)
	public Object method7250(Buffer var1) {
		return this.field4447.vmethod7271(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lod;",
		garbageValue = "85005333"
	)
	public static class409 method7247(Class var0) {
		class409[] var1 = new class409[]{field4442, field4449, field4445};
		class409[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class409 var4 = var2[var3];
			if (var4.field4446 == var0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lpi;I)V",
		garbageValue = "-1411483047"
	)
	public static void method7255(Object var0, Buffer var1) {
		class405 var2 = method7248(var0.getClass());
		var2.vmethod7273(var0, var1);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Loq;",
		garbageValue = "-693782319"
	)
	static class405 method7248(Class var0) {
		class409 var1 = method7247(var0);
		if (var1 == null) {
			throw new IllegalArgumentException();
		} else {
			return var1.field4447;
		}
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIIB)V",
		garbageValue = "10"
	)
	static void method7269(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && SecureRandomFuture.clientPreferences.areaSoundEffectsVolume != 0) {
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) {
				class315.method5816(var0.soundEffects[var1], var2, var3);
			}
		}
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(IIIILpl;Ljr;B)V",
		garbageValue = "88"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var9 * var2 + var3 * var8 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2((double)var10, (double)var11);
			int var14 = var5.width / 2 - 25;
			int var15 = (int)(Math.sin(var12) * (double)var14);
			int var16 = (int)(Math.cos(var12) * (double)var14);
			byte var17 = 20;
			PcmPlayer.redHintArrowSprite.method7807(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			ArchiveDisk.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "968032727"
	)
	static final void method7267() {
		Client.field671 = Client.cycleCntr;
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2119395151"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (Players.friendsChatManager != null) {
			PacketBufferNode var1 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2828, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class116.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
