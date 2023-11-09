import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -25531251
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -740583791
	)
	public int field4636;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -506869823
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 84664645
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 842447949
	)
	public int field4644;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1721152621
	)
	public int field4641;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1343036557
	)
	public int field4642;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1146186045
	)
	public int field4640;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 130583873
	)
	public int field4643;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 233709739
	)
	public int field4645;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2142254499
	)
	public int field4637;

	public GraphicsDefaults() {
		this.compass = -1; // L: 7
		this.field4636 = -1; // L: 8
		this.mapScenes = -1; // L: 9
		this.headIconsPk = -1; // L: 10
		this.field4644 = -1; // L: 11
		this.field4641 = -1; // L: 12
		this.field4642 = -1; // L: 13
		this.field4640 = -1; // L: 14
		this.field4643 = -1; // L: 15
		this.field4645 = -1; // L: 16
		this.field4637 = -1; // L: 17
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)V",
		garbageValue = "-1761039075"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4635.group);
		Buffer var3 = new Buffer(var2);

		while (true) {
			int var4 = var3.readUnsignedByte();
			if (var4 == 0) {
				return; // L: 51
			}

			switch(var4) { // L: 25
			case 1:
				var3.readMedium(); // L: 46
				break;
			case 2:
				this.compass = var3.method9108(); // L: 31
				this.field4636 = var3.method9108(); // L: 32
				this.mapScenes = var3.method9108(); // L: 33
				this.headIconsPk = var3.method9108(); // L: 34
				this.field4644 = var3.method9108(); // L: 35
				this.field4641 = var3.method9108(); // L: 36
				this.field4642 = var3.method9108(); // L: 37
				this.field4640 = var3.method9108(); // L: 38
				this.field4643 = var3.method9108(); // L: 39
				this.field4645 = var3.method9108(); // L: 40
				this.field4637 = var3.method9108(); // L: 41
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lgz;",
		garbageValue = "-1565571529"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0); // L: 18
		if (var1 != null) { // L: 19
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0); // L: 20
			var1 = new VarpDefinition(); // L: 21
			if (var2 != null) { // L: 22
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0); // L: 23
			return var1; // L: 24
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-93"
	)
	static final void method8084() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 4827 4828 4835
			if (var0.plane == GameEngine.Client_plane && !var0.isFinished) { // L: 4829
				if (Client.cycle >= var0.cycleStart) { // L: 4830
					var0.advance(Client.field564); // L: 4831
					if (var0.isFinished) { // L: 4832
						var0.remove();
					} else {
						class31.scene.drawEntity(var0.plane, var0.x, var0.y, var0.z, 60, var0, 0, -1L, false); // L: 4833
					}
				}
			} else {
				var0.remove();
			}
		}

	} // L: 4837
}
