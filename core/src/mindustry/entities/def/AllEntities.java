package mindustry.entities.def;

import mindustry.annotations.Annotations.*;

class AllEntities{

    @EntityDef({BulletComp.class, VelComp.class, TimedComp.class})
    class BulletDef{}

    @EntityDef(value = {TileComp.class}, isFinal = false)
    class TileDef{}

    @EntityDef({EffectComp.class})
    class EffectDef{}

    @EntityDef({DecalComp.class})
    class DecalDef{}

    @EntityDef({PlayerComp.class})
    class PlayerDef{}

    @EntityDef({UnitComp.class})
    class GenericUnitDef{}

    @GroupDef(EntityComp.class)
    void all(){

    }

    @GroupDef(PlayerComp.class)
    void player(){

    }

    @GroupDef(value = UnitComp.class, spatial = true)
    void unit(){

    }

    @GroupDef(TileComp.class)
    void tile(){

    }

    @GroupDef(SyncComp.class)
    void sync(){

    }
}
